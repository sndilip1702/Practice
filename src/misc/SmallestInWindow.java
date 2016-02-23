package misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given an array of N numbers, and an integer K, find the minimum for each window of size K
 * as it slides through the array. Example, for [2, 3, 6, 5, 7, 1] and K = 3, the result is [2, 3, 5, 1].
 * PS: O(N log K) is quite simple. Try to solve it in O(N).
 */

// use double ended queue for O(n)
public class SmallestInWindow {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] inputArray;
        List<Integer> resultArray = new ArrayList<Integer>();
        int K, i;
        // consider input array to be given as comma separated values
        String[] input = in.nextLine().split(", ");
        inputArray = new int[input.length];
        for (i = 0; i < input.length; i++) {
            inputArray[i] = Integer.parseInt(input[i]);
        }
        K = in.nextInt();

        for (i = 0; i < inputArray.length; i++) {

        }
        System.out.println(resultArray);

        in.close();
    }

}
