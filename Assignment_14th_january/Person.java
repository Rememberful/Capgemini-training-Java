package Assignment_14th_january;
//Level 1
public class Person {
 String name;

 void showName() {
     System.out.println("Name: " + name);
 }

 // main method inside Person class
 public static void main(String[] args) {

     Manager manager = new Manager();
     manager.name = "Rahul";
     manager.employeeId = 101;
     manager.salary = 75000;

     manager.showName();
     manager.showEmployeeId();
     manager.showSalary();
 }
}

//Level 2
class Employee extends Person {
 int employeeId;

 void showEmployeeId() {
     System.out.println("Employee ID: " + employeeId);
 }
}

//Level 3
class Manager extends Employee {
 double salary;

 void showSalary() {
     System.out.println("Salary: " + salary);
 }
}
