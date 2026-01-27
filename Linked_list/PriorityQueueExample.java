package Linked_list;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(90);
        pq.offer(10);
        pq.offer(0);
        pq.offer(50);
        pq.offer(30);

        System.out.println("PriorityQueue elements:");
        System.out.println(pq);

        System.out.println("Head element: " + pq.peek());

        pq.remove(); // removes smallest element
        System.out.println("After remove: " + pq);
        
        //PriorityQueue does NOT allow you to reliably print a value at a given index.
    }
}
