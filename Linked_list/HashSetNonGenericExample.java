package Linked_list;

import java.util.HashSet;
public class HashSetNonGenericExample {
	 public static void main(String[] args) {

	        HashSet hs = new HashSet<>();   // Non-generic HashSet

	        hs.add(10);
	        hs.add("Java");
	        hs.add(10);        // Duplicate
	        hs.add(3.14);

	        System.out.println("HashSet elements:");
	        System.out.println(hs);

	        boolean isAdded = hs.add("Java");
	        if (!isAdded) {
	            System.out.println("Duplicate element not added!");
	        }
	    }
}
