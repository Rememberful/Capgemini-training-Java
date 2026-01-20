package Assignment_9th_January;
import java.util.Scanner;

//Count the number of digits in the number
public class question7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        // Handle 0 separately
        if (num == 0) {
            count = 1;
        } else {
            if (num < 0) {
                num = -num;   // make number positive
            }

            while (num > 0) {
                count++;
                num = num / 10;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
