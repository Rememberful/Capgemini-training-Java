package Assignment_24th_January;

import java.util.*; 

public class CollectionExample {
    public static void main(String[] args) {

        // LinkedList object
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");

        // Vector object
        List<String> vector = new Vector<>();
        vector.add("Cat");
        vector.add("Dog");
        vector.add("Elephant");

        // Stack object
        List<String> stack = new Stack<>();
        stack.add("Red");
        stack.add("Green");
        stack.add("Blue");

        // Using common List methods
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Vector: " + vector);
        System.out.println("Stack: " + stack);

        System.out.println("LinkedList element at index 1: " + linkedList.get(1));

        vector.remove("Dog");
        System.out.println("Vector after removal: " + vector);

        System.out.println("Stack size: " + stack.size());

        System.out.println("LinkedList contains Apple? " + linkedList.contains("Apple"));

        stack.clear();
        System.out.println("Stack after clear(): " + stack);
    }
}
