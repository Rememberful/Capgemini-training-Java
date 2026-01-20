package Assignment_9th_January;
import java.util.Scanner;

//Java program that checks whether a given integer is single digit or double digit, including negative numbers.
public class question2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if ((num >= 0 && num <= 9) || (num <= 0 && num >= -9)) {
            System.out.println("Single digit number");
        } 
        else if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99)) {
            System.out.println("Double digit number");
        } 
        else {
            System.out.println("Number is not single or double digit");
        }
    }
}
