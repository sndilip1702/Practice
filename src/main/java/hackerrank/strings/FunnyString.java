package hackerrank.strings;

import java.util.Scanner;

public class FunnyString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T, i;
        T = in.nextInt();
        in.nextLine();
        String[] S = new String[T];
        for (i = 0; i < T; i++) {
            S[i] = in.nextLine();
        }
        for (i = 0; i < T; i++) {
            boolean funny = false;
            for (int j = 1; j < S[i].length(); j++) {
                int left = Math.abs((int) S[i].charAt(j) - (int) S[i].charAt(j - 1));
                int right = Math.abs((int) S[i].charAt(S[i].length() - j) - (int) S[i].charAt(S[i].length() - j - 1));
                if (left == right) {
                    funny = true;
                } else {
                    funny = false;
                    break;
                }
            }
            if (funny) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }

        in.close();
    }

}
