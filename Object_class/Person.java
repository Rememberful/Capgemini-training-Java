package Object_class;

public class Person {
	
//	{
//		System.out.println(this); //the same object
//	}
	String name;
	int id;
	int salary;
	String dept;
	Person(int id, String name, int salary, String dept){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	//Over writing 
	@Override
	public String toString() { //toString() was there in java.lang
		return "id: "+id+" name: "+name+ " salary: "+salary+" dept: "+dept;
	}
	
	public static void main(String[] args) {
//		Person p = new Person();
		Person p = new Person(10,"XYZ", 30000,"HR");
//		System.out.println(p); // p is converted to p.toString()
//		System.out.println(p.toString());
		Person[] persons = new Person[3];
		persons[0] =p;
		persons[1] =new Person(11,"ABC",80000,"POP");
		persons[2] =new Person(12,"DEF",90000,"XOX");
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i]);
		}
	}
}
