package prac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeItAnagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String src = (in.nextLine());
        String tar = in.nextLine();
        int length = 0;
        Map<Character, Integer> an = new HashMap<Character, Integer>();

        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (an.containsKey(c))
                an.put(c, an.get(c) + 1);
            else
                an.put(c, 1);
        }

        for (int j = 0; j < tar.length(); j++) {
            char c = tar.charAt(j);
            if (an.containsKey(c) && an.get(c) > 0)
                an.put(c, an.get(c) - 1);
            else
                length += 1;
        }
        for (Map.Entry<Character, Integer> entry : an.entrySet()) {
            if (entry.getValue() > 0)
                length += entry.getValue();
        }
        System.out.println(length);
        in.close();
    }

}
