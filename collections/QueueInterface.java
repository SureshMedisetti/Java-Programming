package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> line = new PriorityQueue<>();
        line.offer(12);
        line.offer(2);
        line.offer(1);
        line.offer(10);

        System.out.println(line);
    }
}
