package Linked_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    // constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // sort based on id
    @Override
    public int compareTo(Employee e) {
        return this.id - e.id;   // ascending order
    }
}

public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // create employees
        employees.add(new Employee(3, "Alice", 50000));
        employees.add(new Employee(1, "Bob", 45000));
        employees.add(new Employee(2, "Charlie", 55000));

        // sort employees by id
        Collections.sort(employees);

        // print employees
        for (Employee e : employees) {
            System.out.println(
                "ID: " + e.id +
                ", Name: " + e.name +
                ", Salary: " + e.salary
            );
        }
    }
}
