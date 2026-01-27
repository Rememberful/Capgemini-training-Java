package Linked_list;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(40);   // duplicate
        list.add(400);
        // Convert ArrayList to HashSet (removes duplicates)
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("HashSet elements:");
        System.out.println(set);
        // Clear the list
        list.clear();

        // Add HashSet elements back to list
        list.addAll(set);

        System.out.println("ArrayList after adding from HashSet:");
        System.out.println(list);
    }
}
