package Assignment_24th_January;

import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    // Constructor
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Display method
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentListExample {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        // 1. Store students
        students.add(new Student(1, "Aman", 75));
        students.add(new Student(2, "Riya", 38));
        students.add(new Student(3, "Kunal", 90));
        students.add(new Student(4, "Neha", 45));

        // Display all students
        System.out.println("All Students:");
        for (Student s : students) {
            s.display();
        }

        // 2. Filter Passed Students (marks >= 40)
        System.out.println("\nPassed Students:");
        for (Student s : students) {
            if (s.marks >= 40) {
                s.display();
            }
        }

        // 3. Find Topper
        Student topper = students.get(0);
        for (Student s : students) {
            if (s.marks > topper.marks) {
                topper = s;
            }
        }
        System.out.println("\nTopper:");
        topper.display();

        // 4. Search Student by Name
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(searchName)) {
                System.out.println("Student Found:");
                s.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }

        // 5. Count Passed and Failed Students
        int passCount = 0, failCount = 0;
        for (Student s : students) {
            if (s.marks >= 40) {
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("\nPassed Students Count: " + passCount);
        System.out.println("Failed Students Count: " + failCount);

        sc.close();
    }
}

