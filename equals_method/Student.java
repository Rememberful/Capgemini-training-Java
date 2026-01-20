package equals_method;
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
	public boolean equals(Object o) { // why object? to compare the object, basically we are doing the upcasting
		Student s = (Student)o; //DC
		if(this.id==s.id && this.name==s.name) {
			return true;
		}
		return false;
		
		//or can write 
		//return this.id==s.id && this.name==s.name
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student(10,"XYZ");
		Student s2 = new Student(10,"XYZ");
		Student s3 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
