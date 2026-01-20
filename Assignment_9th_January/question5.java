package Assignment_9th_January;
import java.util.Scanner;

//Java program to convert a capital alphabet to lowercase and lowercase to capital
public class question5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            // Convert capital to small
            ch = (char)(ch + 32);
            System.out.println("Lowercase: " + ch);
        } 
        else if (ch >= 'a' && ch <= 'z') {
            // Convert small to capital
            ch = (char)(ch - 32);
            System.out.println("Uppercase: " + ch);
        } 
        else {
            System.out.println("Not an alphabet");
        }
    }
}
