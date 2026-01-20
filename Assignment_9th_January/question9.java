package Assignment_9th_January;
import java.util.Scanner;

//Java program to count how many zeros are present in a given number
public class question9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int zeroCount = 0;

        // Handle negative number
        if (num < 0) {
            num = -num;
        }

        // Handle 0 separately
        if (num == 0) {
            zeroCount = 1;
        } else {
            while (num > 0) {
                int digit = num % 10;

                if (digit == 0) {
                    zeroCount++;
                }

                num = num / 10;
            }
        }

        System.out.println("Number of zeros: " + zeroCount);
    }
}
