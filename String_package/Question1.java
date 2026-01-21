package String_package;
import java.util.Scanner;
//Question: Java Program to Remove Digits from a String
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // ASCII of digits: 48 to 57
            if (ch < '0' || ch > '9') {
                result = result + ch;
            }
        }

        System.out.println("String without digits: " + result);
    }
}
