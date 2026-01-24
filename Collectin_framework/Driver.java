package Collectin_framework;

import java.lang.reflect.Array;
import java.util.*;
public class Driver {

	//object for array list
	public static void main(String[] args) {
		//Generic- same type of data 
		//NOn generic - different type of data 
		//To create generic use <>, with data type mentioned
			
		//To store only string data
//		ArrayList<String> a1 = new ArrayList<String>(); //First <String> is compulsory !
//		//using method 
//		a1.add("xyz"); // give same data type for all a1
//		a1.add("abc"); // give same data type for all a1
//		a1.add("Python"); // give same data type for all a1
//		System.out.println(a1); //printing all via array list name 
		
		//Using .get to print using the index number
//		System.out.println(a1.get(0));
//		System.out.println(a1.get(1));
		
		//To remove the element, we uses .remove()
//		a1.remove(1);
//		System.out.println(a1.get(1));
		
		
		//List<String> a1 = new ArrayList<String>();
		//We have .add(), .set(), .remove() in this as same as ArrayList
		
		
		//Creating non generic
		//ArrayList a1 = new ArrayList();
		
		//Here auto boxing will take place.
		// allows duplciates, null to be stored
		
		// to see capacity 
//		System.out.println(a1.size());
//		System.out.println(a1.capacity());
		
		//capacity can specified
		//ArrayList a1 = new ArrayList(10);
		
//		ArrayList a1 = new ArrayList<>();
//		a1.add("Java");
//		a1.add(45.8);
//		System.out.println("a1" + a1);
//		ArrayList a2 = new ArrayList(30);
//		ArrayList a3 = new ArrayList(a1);
//		a3.add(100);
//		//passing on index 1
//		a3.add(1,"sql");
//		System.out.println("a3" + a3);
		
		ArrayList <String> a1= new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		
		ArrayList <String> a2= new ArrayList<String>();
		a2.add("D");
		a2.add("E");
		
		a1.addAll(a2);
		System.out.println(a1);
		a1.addAll(2,a2);
		System.out.println(a1);
		
		//we can also add object type of data
		
		
	}
}
