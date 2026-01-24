package Test_package;

import java.util.Scanner;

// Custom unchecked exception
class UnauthorizedAccessException extends RuntimeException {
    public UnauthorizedAccessException(String message) {
        super(message);
    }
}

// Custom checked exception
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

// Abstraction
interface Payroll {
    double calculatePay();
}

abstract class Employee implements Payroll {
    private final int employeeId;
    private final String name;
    private final String role;
    private double salary;

    protected Employee(int employeeId, String name, String role, double salary) throws InvalidSalaryException {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        setSalary("HR", salary); // constructor allowed via HR
    }

    protected double getSalary() {
        return salary;
    }

    // Controlled setter with authorization + validation
    public void setSalary(String requesterRole, double newSalary) throws InvalidSalaryException {

        if (!"HR".equalsIgnoreCase(requesterRole)) {
            throw new UnauthorizedAccessException(
                    "Only HR is authorized to modify salary."
            );
        }

        if (newSalary <= 0) {
            throw new InvalidSalaryException(
                    "Salary must be greater than zero."
            );
        }

        this.salary = newSalary;
    }

    public String getEmployeeInfo() {
        return "ID: " + employeeId +
               ", Name: " + name +
               ", Role: " + role;
    }
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, String role, double salary) throws InvalidSalaryException {
        super(id, name, role, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }
}

class ContractEmployee extends Employee {

    private final int hoursWorked;
    private final double hourlyRate;

    public ContractEmployee(int id, String name, String role, int hoursWorked, double hourlyRate) throws InvalidSalaryException {

        super(id, name, role, hoursWorked * hourlyRate);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeePayrollSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            Employee fullTime = new FullTimeEmployee(1, "Aditya", "HR", 6000);
            Employee contractor = new ContractEmployee(2, "Utsav", "Developer", 160, 40);

            System.out.println(fullTime.getEmployeeInfo());
            System.out.println("Pay: " + fullTime.calculatePay());

            System.out.println(contractor.getEmployeeInfo());
            System.out.println("Pay: " + contractor.calculatePay());

            // User-driven testing
            System.out.print("\nEnter requester role (HR / Developer): ");
            String requesterRole = sc.nextLine();
            System.out.print("Enter new salary: ");
            double newSalary = sc.nextDouble();
            fullTime.setSalary(requesterRole, newSalary);

            System.out.println("Updated Pay: " + fullTime.calculatePay());

        } catch (InvalidSalaryException e) {
            System.out.println("Salary Error: " + e);
        } catch (UnauthorizedAccessException e) {
            System.out.println("Access Error: " + e);
        }
    }
}
