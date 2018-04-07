package hackerrankcontest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SwappingBridges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] N = new int[T + 1];
        int[][] Y = new int[T + 1][];
        int i, j;
        for (i = 1; i <= T; i++) {
            N[i] = in.nextInt();
            Y[i] = new int[N[i] + 1];
            for (j = 1; j <= N[i]; j++) {
                Y[i][j] = in.nextInt();
            }
        }
        for (i = 1; i <= T; i++) {
            Set<Integer> elem = new HashSet<Integer>();
            for (j = 1; j <= N[i]; j++) {
                elem.add(Y[i][j]);
            }
            int swaps = 0;
            int start = 1;
            int cur = Y[i][start];
            elem.remove(start);
            while (!elem.isEmpty()) {
                while (Y[i][cur] != start) {
                    elem.remove(cur);
                    cur = Y[i][cur];
                }
                if (Y[i][cur] == start) {
                    elem.remove(cur);
                    Iterator<Integer> it = elem.iterator();
                    if (elem.size() > 0) {
                        int t = it.next();
                        Y[i][cur] = t;
                        cur = t;
                        start = t;
                        swaps++;
                    } else if (Y[i][cur] != 1) {
                        Y[i][cur] = 1;
                    }
                }
            }
            System.out.println(swaps);
        }
        in.close();
    }
}
