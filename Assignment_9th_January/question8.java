package Assignment_9th_January;
import java.util.Scanner;

//Java program to count how many even and odd digits are present in a given number.
public class question8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        // Handle negative number
        if (num < 0) {
            num = -num;
        }

        // Handle 0 separately
        if (num == 0) {
            evenCount = 1;
        } else {
            while (num > 0) {
                int digit = num % 10;

                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }

                num = num / 10;
            }
        }

        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);
    }
}
