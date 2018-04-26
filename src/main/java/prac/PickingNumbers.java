package prac;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {
    private static int pickingNumbers(int[] a) {
        Arrays.sort(a);
        int len = a.length;
        int i = 0;
        int j = 1;
        int runningCount = 1;
        int highCount = runningCount;
        while (j < len) {
            if (a[i] == a[j] || (a[j] - a[i] == 1)) {
                runningCount++;
                if (runningCount > highCount) {
                    highCount = runningCount;
                }
            } else {
                runningCount = 1;
                i = j;
            }

            j++;
        }
        return highCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
