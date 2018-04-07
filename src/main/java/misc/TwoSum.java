package misc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by sndil on 2/21/2016.
 * Given a number K , find a pair of elements in the input array that sum to K.
 * Input : Comma separated array and K
 */
public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(",");
        int sum = in.nextInt();
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (numbers.contains(sum - num)) {
                System.out.println(num + " " + (sum - num));
            }
        }
        in.close();
    }
}
