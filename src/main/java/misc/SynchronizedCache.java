package misc;

import java.time.Instant;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * A thread safe cache that has a timeout attached to each entry in the Cache.
 */
public class SynchronizedCache<K, V> {
    private int size = 1000;
    private ConcurrentMap<K, CacheValue> cache;

    public SynchronizedCache() {
        this.cache = new ConcurrentHashMap<>(this.size);
    }

    public SynchronizedCache(int size) {
        this.cache = new ConcurrentHashMap<>(size);
    }

    private class CacheValue {
        V value;
        long expiresAt;

        private CacheValue(V value, long expireAfter) {
            this.value = value;
            this.expiresAt = expireAfter;
        }

        private V getValue() {
            return value;
        }

        private long getExpiresAt() {
            return expiresAt;
        }
    }

    /**
     * Puts a value into the
     *
     * @param key         - The Key for the value to be stored in cache.
     * @param value       - The CacheValue to be stored in cache.
     * @param expireAfter - The time in milliseconds after which the value should expire.
     */
    private void put(K key, V value, long expireAfter) {
        // Clean up can be called each time before putting a value to ensure eviction of expired values which keeps the cache "hot".
        //cleanup();
        long now = Instant.now().toEpochMilli();
        CacheValue cacheValue = new CacheValue(value, now + expireAfter);
        cache.putIfAbsent(key, cacheValue);
    }

    private V get(K key) {
        // Clean up can be called each time before getting a value so the cache is clean, this can be expensive since a cache should be fast on reads.
        //cleanup();
        long now = Instant.now().toEpochMilli();
        Optional<CacheValue> cacheValue = Optional.ofNullable(cache.getOrDefault(key, null));
        return cacheValue.map(cv -> {
            if (cv.getExpiresAt() > now) {
                return cv.getValue();
            }
            cache.remove(key);
            return null;
        }).orElse(null);
    }

    private void cleanup() {
        Iterator<Map.Entry<K, CacheValue>> iterator = cache.entrySet().iterator();
        long now;
        while (iterator.hasNext()) {
            CacheValue cacheValue = iterator.next().getValue();
            now = Instant.now().toEpochMilli();
            if (cacheValue.expiresAt <= now) {
                iterator.remove();
            }
        }
    }

}