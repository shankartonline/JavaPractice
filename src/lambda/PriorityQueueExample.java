package lambda;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        pr.add(1);
        pr.add(2);
        pr.add(3);
        System.out.println(pr.peek());
        System.out.println(pr.poll());
        System.out.println(pr.peek());
    }
}
