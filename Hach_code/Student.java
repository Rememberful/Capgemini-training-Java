package Hach_code;

import java.util.Objects;

public class Student {
	int id;
	String name;
	int mark;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		//java.util.Objects is utility class
		return Objects.hash(id); //comparing name, not address
	}
	
	public static boolean Check(Student s1, Student s2) {
		return s1.hashCode()==s2.hashCode();
	}
	public static void main(String[] args) {
		Student s1 = new Student(10,"XYX");
		Student s2 = new Student(10,"XYX");
		Student s3 = s1;
		System.out.println(Check(s1,s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
