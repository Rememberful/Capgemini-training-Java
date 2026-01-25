package Collectin_framework;
import java.util.*;

public class Employee {
	int id;
	String name;
	String Dept;
	int Salary;
	public Employee() {
		
		
	}
	public Employee(int id, String name, String Dept, int Salary) {
		super();
		this.id = id;
		this.name = name;
		this.Dept = Dept;
		this.Salary = Salary;
	}
	
	static List<Employee> findEmpByDep(List<Employee>)
	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(new Employee(10,"Adi", "IT", 3000));
		a.add(new Employee(11,"Adit", "HR", 3000));
		a.add(new Employee(12,"Adity", "IT", 3000));
		a.add(new Employee(13,"Aditya", "CEO", 3000));
		a.add(new Employee(14,"Ad", "CTO", 3000));
	}	
	
	public String toString() {
		return "id:"+id+"name: " + name + "dept:" + Dept + "Salary:" + Salary;
	}
	
}
