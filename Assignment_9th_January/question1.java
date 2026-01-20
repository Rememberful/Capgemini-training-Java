package Assignment_9th_January;
import java.util.Scanner;

// To check if given month number is valid or not.
public class question1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("Valid month");
        } else {
            System.out.println("Invalid month");
        }
    }
}
