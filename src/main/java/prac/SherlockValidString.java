package prac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * All characters in have the same exact frequency (i.e., occur the same number of times). For
 * example, "aabbcc" is valid, but "baacdd" is not valid.
 * <p>
 * Deleting exactly character from will result in all its
 * characters having the same frequency. For example, "aabbccc" and "aabbcc" are valid because all their letters will
 * have the same frequency if we remove occurrence of c, but "abbccc" is not valid because we'd need to
 * remove 3 characters.
 * <p>
 * Constraints: 1 <= s <= 100000
 */
public class SherlockValidString {

    private static String isValid(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        int len = s.length();
        int highCount = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (dict.containsKey(c)) {
                dict.put(c, dict.get(c) + 1);
                highCount = dict.get(c) > highCount ? dict.get(c) : highCount;
            } else {
                dict.put(c, 1);
            }
        }

        Iterator iterator = dict.entrySet().iterator();
        int maxAllowed = 0;
        while (iterator.hasNext()) {
            if (!((Map.Entry) iterator.next()).getValue().equals(highCount))
                maxAllowed++;
        }

        return maxAllowed > 1 ? "NO" : "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
