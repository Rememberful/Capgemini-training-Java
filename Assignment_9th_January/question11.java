package Assignment_9th_January;
import java.util.Scanner;

//Java program to check whether a given number is a palindrome or not.
public class question11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        // Handle negative numbers
        if (num < 0) {
            num = -num;
            original = num;
        }

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}
