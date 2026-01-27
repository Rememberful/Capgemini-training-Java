package Linked_list;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // Add elements
        dq.add(10);        // add at end
        dq.addLast(20);    // add at end
        dq.addFirst(5);    // add at front
        dq.offerLast(8);
        System.out.println("Deque elements: " + dq);

        // Remove elements
        dq.removeFirst(); // removes 5
        dq.removeLast();  // removes 8

        System.out.println("After removals: " + dq);

        // Peek elements
        System.out.println("First element: " + dq.peekFirst());
        System.out.println("Last element: " + dq.peekLast());
    }
}