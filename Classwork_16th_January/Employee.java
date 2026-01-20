package Classwork_16th_January;

public class Employee {
	int id;
	String name;
	int salary;
	String dept;
	
	public Employee() {
		
	}
	public Employee(int id) { //constructor 1
		this.id = id; //initializing the id
	}
	public Employee(int id, String name) {
		this.id = id; // or this(id) //Called constructor chaining 
		this.name = name;
	}
	public Employee(int id, String name, int salary) {
		this.id = id; // or this(id, name)
		this.name = name;
		this.salary = salary;
	}
	
	public void pritf() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(1);
		e.pritf();
		Employee e1 = new Employee(1, "BMW");
		e1.pritf();
	}
	
	
	
}
