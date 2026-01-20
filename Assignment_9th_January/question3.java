package Assignment_9th_January;
import java.util.Scanner;

//To check if given number is divisbile by 3 and 5 or not 
public class question3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Number is divisible by both 3 and 5");
        } else {
            System.out.println("Number is not divisible by both 3 and 5");
        }
    }
}
