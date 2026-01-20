package equals_method;
import java.util.Objects;

public class Student {
	public int id;
	public String name;
	int mark;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) { // why object? to compare the object, basically we are doing the upcasting
		Student s = (Student)o; //DC
//		if(o==null) {
//			return false;
//		}
		
		//to check content or state or the object
		if(this.id==s.id && this.name==s.name) {
			return true;
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student(10,"XYZ");
		Student s2 = new Student(10,"XYZ");
		Student s3 = s1;
		Student s4 = null; //if used with equals() it will give null error
//		Person p = new Person(1010, "Raju");
		Object o = new Student(200,"abc");
		System.out.println(s1.getClass()==s2.getClass());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
