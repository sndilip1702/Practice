package hackerrankcontest;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {

    public static void main(String[] args) {
        Node n = new Node();
        PriorityQueue<Node> pq = new PriorityQueue<Node>(10, n);
        pq.offer(new Node(1));
        pq.offer(new Node(10));
        pq.offer(new Node(3));
        System.out.println(pq.peek());
    }

}

class Node implements Comparator<Node> {
    int data;

    public Node() {
    }

    public Node(int d) {
        data = d;
    }

    public int compare(Node o1, Node o2) {
        return o2.data - o1.data;
    }
}
