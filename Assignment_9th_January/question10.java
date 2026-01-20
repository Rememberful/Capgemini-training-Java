package Assignment_9th_January;
import java.util.Scanner;

//Java program to find the average of the digits of a given number.
public class question10 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int sum = 0;
	        int count = 0;

	        // Handle negative number
	        if (num < 0) {
	            num = -num;
	        }

	        // Handle 0 separately
	        if (num == 0) {
	            sum = 0;
	            count = 1;
	        } else {
	            while (num > 0) {
	                int digit = num % 10;
	                sum = sum + digit;
	                count++;
	                num = num / 10;
	            }
	        }

	        double average = (double) sum / count;

	        System.out.println("Average of digits: " + average);
	    }
}
