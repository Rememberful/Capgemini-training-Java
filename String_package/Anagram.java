package String_package;

import java.util.Arrays;

public class Anagram {
	 public static void anagram() {
	        String s1 = "Listen";
	        String s2 = "Silent";

	        s1 = s1.toLowerCase().replace(" ", "");
	        s2 = s2.toLowerCase().replace(" ", "");

	        char[] a1 = s1.toCharArray();
	        char[] a2 = s2.toCharArray();

	        Arrays.sort(a1);
	        Arrays.sort(a2);

	        if (Arrays.equals(a1, a2)) {
	            System.out.println("Anagram");
	        } else {
	            System.out.println("Not Anagram");
	        }}
	 public static void panagram() {
	        
	        String s = "The quick brown fox jumps over the lazy dog";
	        s = s.toLowerCase();

	        boolean isPangram = true;

	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            if (s.indexOf(ch) == -1) {
	                isPangram = false;
	                break;
	            }
	        }

	        if (isPangram) {
	            System.out.println("Pangram");
	        } else {
	            System.out.println("Not Pangram");
	        }
	    }
	 public static void main(String[] args) {
		anagram();
		panagram();
	}
}