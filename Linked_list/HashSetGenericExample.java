package Linked_list;
import java.util.HashSet;

public class HashSetGenericExample {
	public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);   // Duplicate

        System.out.println("HashSet elements:");
        System.out.println(numbers);

        if (!numbers.add(20)) {
            System.out.println("Duplicate not allowed");
        }
    }
}
