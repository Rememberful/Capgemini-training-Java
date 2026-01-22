package String_package;

import java.util.Arrays;

//Question 1 
public class Demo {
	public static void main(String[] args) {
//		String a = "xyz";
//		String b = "xyz";
//		String c = "abc";
//		System.out.println(a);
//		System.out.println(a.toString());
//		System.out.println(a.getClass());
//		System.out.println(a.equals(b));
//		System.out.println(a.equals(c));
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		System.out.println(c.hashCode());
		
		
		//Creating string using constructor
		
//		String s1 = new String("xyz");
//		String s2 = "abc";
//		String s3 = "xyz";
//		String s4 = new String("xyz");
//		String s5 = new String("abc");
//		System.out.println(s1.equals(s3)); //true
//		System.out.println(s1==s2); //false
//		System.out.println(s1==s3); //false
//		System.out.println(s1==s4); //false
//		System.out.println(s1==s5); //false
//		System.out.println(s1.equals(s2)); //false
//		System.out.println(s1.equals(s4)); //true
//		System.out.println(s1.equals(s5)); //false
		
		
		//Strings be immutable
//		String s = "abc";
//		s.toUpperCase(); //it modified and return the address (not storing)
//		System.out.println(s); //it be in lower case
//		s = s.toUpperCase(); //it modified and return the address and stored
//		System.out.println(s); //it be in upper case
		
		
		//in built methods
//		String s = "abc";
//		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(4)); //index out of bound as size of s is 0,1,2 only.
		
//		String s = "abc";
//		System.out.println(s.length());
//		System.out.println(s.charAt(1));
		
//		String a = "xyz";
//		String b = "ABC";
//		System.out.println(a.toUpperCase());
//		System.out.println(b.toLowerCase());
		
//		//to remove extra spaces -> only before and after... in between spaces remain as it is
//		String s = "   xyx   ";
//		System.out.println(s);
//		System.out.println(s.trim());

		//substring
//		String b = "abcd";
//		System.out.println(b.substring(1)); //bcd
//		System.out.println(b.substring(1,3)); //bc
//		System.out.println(b); //reference variable be same so immutable
		
		//.toCharArray() -> string to char array
//		String b = "abcde";
//		char[] c = b.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			System.out.println(c[i]);
//		}
		
		//char array to string
//		String st = new String(c); //c -> char array
//		System.out.println(st); //Character get converted to the string
//		String s = "abbcdeb";
//		System.out.println(s.indexOf('b'));
//		System.out.println(s.indexOf('b', 2)); //2 is inclusive
//		System.out.println(s.lastIndexOf('b'));
//		System.out.println(s.indexOf('y')); // if not present it will return -1
//		
//		System.out.println(s.indexOf("de"));//indexOf can also search for the substring
	
//		String s = "i love java";
//		System.out.println(s.contains("love")); //.contains() checks if the substring is present in the string or not.
//		System.out.println(s.contains("python")); //.contains() checks if the substring is present in the string or not.
//		System.out.println(s.contains("lov")); //.contains() checks if the substring is present in the string or not.
		
		
		//.split() -> returns String array
//		String s2 = "hi,bye,java";
//		String[] str = s2.split(","); //to separate on the basis of the occurence of ","
//		for(int i=0;i<str.length;i++) {
//			System.out.println(str[i]);
//		}
		
		
		//.equalsIgnoreCase-> it ignores the case and compares
//		String s1="java";
//		String s2 = "JAVA";
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.equals(s2)); //.equals() -> just compares 
		
		
		//.startsWith() -> to check with the substring it starts or not
//		String s = " hello World";
//		System.out.println(s.startsWith("hello"));
//		System.out.println(s.startsWith("hell"));
//		System.out.println(s.startsWith(" "));
		
		//.endsWith() -> to check with the substring it ends or not
//		String s1 = "Aditya is a boy";
//		System.out.println(s1.endsWith("oy")); //It checks ending with "oy"
		
		//To convert integer to string -> .valueOf()
//		int a = 100;
//		String s=null;
//		s=s.valueOf(a);
//		System.out.println(s);
//		
//		String s = ""; //s = " " => is Empty -> length should be 0 then true & 
//		System.out.println(s.isEmpty());  //if length is zero or not -> or say characters are there or not
//		System.out.println(s.isBlank());  // it checks if there is at least even a space or not
		
//		String s = "hi hi hi studnets";
//		System.out.println(s.replace("hi","bye")); //.replace() -> replaces each occurrence (it don't allow regex)
//		System.out.println(s.replaceFirst("hi","bye")); //.replaceFirst -> replaces first occurrence
//		System.out.println(s.replaceAll("hi", "two")); //.replaceAll -> replaces all occurrence (it also supports regex)
		
//		String s1 = " Aditya";
//		System.out.println(s1.replaceFirst(" ","bye"));
//		
		//.stripLeading() -> removes white spaces from the start
//		String s1 = " Aditya ";
//		System.out.println(s1.stripLeading());
//		//.stripTrailing() -> removes white spaces from the end
//		System.out.println(s1.stripTrailing());
		
		// program to convert every word last character to lower case using inbuilt methods
		// program to swap first character of the word with the last character of the same word
		
		//String buffer way 
//		StringBuffer s1 = new StringBuffer("xyz");
//		StringBuffer s2 = new StringBuffer("xyz");
//		System.out.println(s1.toString());
//		System.out.println(s1);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1==s2); //compares address but it is not overriden yet 

		
		//Converting string buffer to string 
//		String s = new String(s1);
//		
//		//Converting string to String Buffer
//		StringBuffer s3 = new StringBuffer(s);
//		
//		//String builder object
//		StringBuilder s4 = new StringBuilder("abc"); //not thread safe
		
		
		//Inbuilt method for string buffer
		
		//.reverse() 
//		StringBuffer s1 = new StringBuffer("xyz");
//		s1.reverse();
//		System.out.println(s1);
//		
//		//.append()
//		s1.append(" java");
//		System.out.println(s1);
		
//		StringBuffer s2 = new StringBuffer(" 65737483badba bfueb ");
//		System.out.println(s2.capacity()); //default is 16 while not 16 id StringBuffer("something")
//		s2.trimToSize();
//		System.out.println(s2);
		
		//insert()
//		StringBuffer s2 = new StringBuffer("xyz");
//		s2.insert(1, "abc"); //inserting from the index 1
//		System.out.println(s2);
//		
//		//.delete(start,lastindex) (last index is excluded)
//		StringBuffer s3 = new StringBuffer("xyz abc");
//		s3.delete(0, 2); // delete from 0 to 1st index
//		System.out.println(s3);
//		
//		//.replace()
//		StringBuffer s4 = new StringBuffer("xyz abc");
//		s4.replace(0, 2, "adi"); //2nd index is excluded //Also, boolean can't be replaced using "replace()"
//		System.out.println(s4); //size is increased, as it is string buffer and it is mutable
//		
//		
//		//Note:
//		StringBuffer s5 = new StringBuffer("xyz");
//		s5.insert(1, true); //converting boolean to string and then adds at the index 1
//		System.out.println(s5);
//		
//		
//		//array method //it is present in the java.util
//		char[] ch = {'b','a','c'};
//		char[] ch2 = {'c','a','b'};
//		
//		//.sort() -> to sort the array, even character array can be sorted
//		Arrays.sort(ch);
//		System.out.println(Arrays.toString(ch));
//		Arrays.sort(ch2);
//		System.out.println(Arrays.toString(ch2));
//		
//		//.equals -> to check if they are equal or not, here we are comparing the sorted one 
//		System.out.println(Arrays.equals(ch,ch2));
//		
//		System.out.println(Arrays.binarySearch(ch,'a')); //0
//		
//		int[] ch5 = {10,9,9,0};
//		Arrays.sort(ch5);
//		for(int i=0;i<ch5.length;i++) {
//		System.out.println("hi"+ch5[i]);}
		
		
	
	}
}

//annagram panagram
