package hackerrank;

import java.util.Scanner;

public class IceCreamParlour {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T, i, k;
        T = in.nextInt();
        int[] N = new int[T];
        int[] M = new int[T];
        int[][] c = new int[T][];
        for (i = 0; i < T; i++) {
            M[i] = in.nextInt();
            N[i] = in.nextInt();
            c[i] = new int[N[i]];
            for (k = 0; k < N[i]; k++) {
                c[i][k] = in.nextInt();
            }
        }
        for (i = 0; i < T; i++) {
            findMin(M[i], N[i], c[i]);
        }
        in.close();
    }

    public static void findMin(int M, int N, int[] c) {
        int i, j;
        int[] res = new int[2];
        for (i = 0; i < N; i++) {
            for (j = i + 1; j < N; j++) {
                if (M - c[i] - c[j] == 0) {
                    res[0] = i + 1;
                    res[1] = j + 1;
                    break;
                }
            }
            if (res[0] > 0)
                break;
        }
        System.out.println(res[0] + " " + res[1]);
    }

}
