package prac;

import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T;
        T = in.nextInt();
        int[] N = new int[T];
        int[] K = new int[T];
        int[][] input = new int[T][];
        int i, j;

        for (i = 0; i < T; i++) {
            N[i] = in.nextInt();
            K[i] = in.nextInt();
            input[i] = new int[N[i]];
            for (j = 0; j < N[i]; j++) {
                input[i][j] = in.nextInt();
            }
        }
        int tempCount = 0;
        for (i = 0; i < T; i++) {
            tempCount = 0;
            for (j = 0; j < N[i]; j++) {
                if (input[i][j] <= 0) {
                    tempCount++;
                }
            }
            if (tempCount >= K[i])
                System.out.println("NO");
            else
                System.out.println("YES");
        }

    }

}
