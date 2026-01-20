package opearators;

public class ops_example {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println(a + b);   // Addition
        System.out.println(a * b);   // Multiplication

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        a += 2;    // a = a + 2
        System.out.println(a);
        b -= 1;    // b = b - 1
        System.out.println(b);

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println(a > b);   // Greater than
        System.out.println(a == b);  // Equal to

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println(a > b && a > 0);  // AND
        System.out.println(a > b || a < 0);  // OR
    }
}
