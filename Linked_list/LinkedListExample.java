package Linked_list;

import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
	
	List<String> list = new LinkedList<>(); //UC
	
	list.add("A");
	list.add("B");
	list.add("C");
	
	System.out.println(list.get(0));
	
	System.out.println(list);
	}
	
}
