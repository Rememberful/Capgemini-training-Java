package String_package;
import java.util.Scanner;

//Questio: Count the number of digits, alphabet, and special characters (space are also special characters)
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string for Q2: ");
        String str = sc.nextLine();
        int alphabets = 0, digits = 0, special = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                alphabets++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                special++;
            }
        }
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Special Chars: " + special);
    }
}
