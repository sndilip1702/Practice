package misc;

import java.util.HashMap;

/**
 * Created by sndil on 2/22/2016.
 */
class Node {
    int key;
    int value;
    Node next;
    Node prev;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {
    HashMap<Integer, Node> map;
    Node head;
    Node tail;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<Integer, Node>();
    }

    public static void main(String[] args) {
        /** Code for usage */
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        } else {
            return -1;
        }
    }

    public void remove(Node n) {
        if (n.prev != null) {
            n.prev.next = n.next;
        } else {
            head = n.next;
        }

        if (n.next != null) {
            n.next.prev = n.prev;
        } else {
            tail = n.prev;
        }
    }

    public void setHead(Node n) {
        n.next = head;
        n.prev = null;
        if (head != null) {
            head.prev = n;
        }
        head = n;
        if (tail == null) {
            tail = head;
        }
    }

    public void set(int key, int value) {
        if (map.containsKey(key)) {
            Node n = map.get(key);
            n.value = value;
            remove(n);
            setHead(n);
        } else {
            Node newNode = new Node(key, value);
            if (map.size() > capacity) {
                map.remove(tail.key);
                remove(tail);
                setHead(newNode);
            } else {
                setHead(newNode);
            }
            map.put(key, newNode);
        }
    }
}
