package Classwork_17th_January;

public abstract class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	abstract void printE();
	
	public Employee() {
		
	}
	
	public static void main(String[] args) {
		Raju r = new Raju(10, "Raju", 1000000.0);
		r.printE();
		Employee e = new Raju(20,"Ram", 1020000.0);
		e.printE();
	}
}

class Raju extends Employee{

	double sal;
	public Raju(int id,String name,double sal) {
		super(id,name);
		this.sal=sal;
	}
	public void printE() {
		System.out.println(id+"\n"+name+"\n"+sal);
	}
}