package Assignment_9th_January;
import java.util.Scanner;

//Java program to print odd numbers from n1 to n2.
public class question6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
