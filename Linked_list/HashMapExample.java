package Linked_list;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap map = new HashMap<>();
        // Adding elements
        map.put(1, "Java");
        map.put(2, "Python");
        map.put('a', "C++");
        map.put(2, "JavaScript"); // duplicate key
        System.out.println("HashMap elements:");
        System.out.println(map);

        // Access value using key
        System.out.println("Value at key 2: " + map.get('a')); //to get the value stored with key '2'
        System.out.println("Value at key 20: " + map.getOrDefault(2, "ADITYA")); //to get the value stored with key '2'

        // Check key and value
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value Java? " + map.containsValue("Java"));

        // Remove element
        map.remove(1);
        System.out.println("After removal:");
        System.out.println(map);
    }
}