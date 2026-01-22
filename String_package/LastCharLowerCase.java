package String_package;

import java.util.*;

// Converting last character of each word
public class LastCharLowerCase {
	public static void main(String[] args) {
        String input = "Hello WORLd JAVA ProGRam";
        String[] words = input.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int len = word.length();
            if (len > 0) {word = word.substring(0, len - 1) + word.substring(len - 1).toLowerCase();
            }
            result = result + word + " ";
        }
        System.out.println(result.trim());
    }
}
