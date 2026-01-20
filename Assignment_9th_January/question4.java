package Assignment_9th_January;
import java.util.Scanner;

//Java program to check whether a given character is a capital alphabet or small alphabet.
public class question4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital Alphabet");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small Alphabet");
        } 
        else {
            System.out.println("Not an alphabet");
        }
    }
}
