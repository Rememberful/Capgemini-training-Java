package Collectin_framework;

import java.util.*;
public class Driver1 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(10,"xyz"));
		list.add(new Student(11,"abc"));
		Student s = new Student(12,"aaa");
		list.add(s);
		
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).id);
			System.out.println(list.get(i).name);
		}
	}
}
