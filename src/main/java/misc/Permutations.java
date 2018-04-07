package misc;

import java.util.Scanner;

/*Anagram Substring Search
 *
 * Given 2 strings, one larger than the other, find all the permutations
 * of the smaller string in the larger string.
 *
 * HINT : Create a window of size of smaller string and compare the occurrences
 * of each value in both the strings
 * */

public class Permutations {
    public static final int MAX = 256;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String pattern = in.nextLine();
        search(text, pattern);
        in.close();
    }

    public static void search(String text, String pattern) {
        int tLen = text.length();
        int pLen = pattern.length();
        int i;
        int[] countP = new int[MAX];
        int[] countT = new int[MAX];
        for (i = 0; i < pLen; i++) {
            countT[text.charAt(i)]++;
            countP[pattern.charAt(i)]++;
        }
        for (i = pLen; i < tLen; i++) {
            if (check(countT, countP)) {
                //System.out.println(text.substring(i-pLen,pLen));
                System.out.println("Found at " + (i - pLen));
            }
            countT[text.charAt(i)]++;
            countT[text.charAt(i - pLen)]--;
        }
        if (check(countT, countP)) {
            //System.out.println(text.substring(i-pLen,pLen));
            System.out.println("Found at " + (i - pLen));
        }
    }

    public static boolean check(int[] countT, int[] countP) {
        for (int i = 0; i < countP.length; i++) {
            if (countP[i] != countT[i])
                return false;
        }
        return true;
    }
}
