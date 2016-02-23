package misc;

import java.util.Scanner;

/**
 * Created by sndil on 2/23/2016.
 */
public class OccurStringInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String toFind = in.nextLine();
        int count = 0;
        if (toFind.length() <= text.length()) {
            for (int i = 0; i < text.length(); i++) {
                int j = 0;
                if (text.charAt(i) == toFind.charAt(j)) {
                    while (j < toFind.length() && i<text.length() && text.charAt(i) == toFind.charAt(j)) {
                        i++;
                        j++;
                    }
                    i--; // move pointer to text back to where we want to start searching from
                    if (j == toFind.length()) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        in.close();
    }
}
