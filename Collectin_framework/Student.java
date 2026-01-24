package Collectin_framework;

public class Student {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//overriding 
	public String toString() {
		return "id:"+id+"name: " + name;
	}
}
