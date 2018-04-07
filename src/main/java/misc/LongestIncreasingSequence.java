package misc;

import java.util.Scanner;

public class LongestIncreasingSequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];
        int i;
        int maxSum = 0, currentSum = 0, startIndex = 0, endIndex = 0;
        for (i = 0; i < arraySize; i++) {
            array[i] = in.nextInt();
        }

        if (arraySize == 1) {
            System.out.println(arraySize);
            System.exit(0);
        }
        for (i = 0; i < arraySize; i++) {
            currentSum += array[i];
            if (currentSum < 0) {
                currentSum = 0;
                if (i <= arraySize - 2) startIndex = i + 1;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                endIndex = i;
            }
        }

        System.out.println("Sum : " + maxSum + " Start : " + startIndex + " End : " + endIndex);

        in.close();
    }
}
