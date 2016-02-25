package misc;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by sndil on 2/24/2016.
 */
public class PQueueSample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(",");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        for (int i = 0; i < input.length; i++) {
            priorityQueue.add(Integer.parseInt(input[i]));
        }
        System.out.println(priorityQueue.peek());
        in.close();
    }
}
