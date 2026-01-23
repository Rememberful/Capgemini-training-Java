package Assignment_22th_January;

public class SpecialSymbols {
	public static void main(String[] args) {
        String input = "Hello@#2024!";

        int count = 0;
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // check if character is NOT letter or digit
            if (!Character.isLetterOrDigit(ch)) {
                count++;
                symbols.append(ch);
            }
        }

        System.out.println("Number of special symbols: " + count);
        System.out.println("Special symbols: " + symbols);
    }
}
