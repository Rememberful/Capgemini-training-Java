package Question_for_hascode_equals_tostring;

import java.util.Objects;

public class Employee {
	int id;
	String name;
	int mark;
	int salary;
	String dept;
	public Employee(int id, String name, int salary, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;

	}
	@Override
	public int hashCode() {
		//java.util.Objects is utility class
		return Objects.hash(id); //comparing name, not address
	}
	
	@Override
	public String toString() { //toString() was there in java.lang
		return "id: "+id+" name: "+name+ " salary: "+salary+" dept: "+dept;
	}

	@Override
	public boolean equals(Object o) { // why object? to compare the object, basically we are doing the upcasting
		if(this==o)  //it compares object name to remove overhead of comparing further.
			return true;
		Employee s = (Employee)o; //DC
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
//		Person p = new Person();
		Employee p = new Employee(10,"XYZ", 30000,"HR");
//		System.out.println(p); // p is converted to p.toString()
//		System.out.println(p.toString());
		Employee[] persons = new Employee[3];
		persons[0] =p;
		persons[1] =new Employee(11,"ABC",80000,"POP");
		persons[2] =new Employee(12,"DEF",90000,"XOX");
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i]);
		}
		
		
	}
		

}
