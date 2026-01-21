package String_package;
import java.util.Scanner;

public class CaseConversion {

    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
        return ch;
    }
    public static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) (ch - 32);
        }
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original: ");
        String input = sc.nextLine();

        char[] result = input.toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 'A' && result[i] <= 'Z') {
                result[i] = toLower(result[i]);
            } else if (result[i] >= 'a' && result[i] <= 'z') {
                result[i] = toUpper(result[i]);
            }
        }

        System.out.println("New String: " + new String(result));
    }
}