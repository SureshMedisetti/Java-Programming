package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(70);
        stack.push(20);
        stack.push(40);
        stack.push(19);

        System.out.println(stack);
    }
}
