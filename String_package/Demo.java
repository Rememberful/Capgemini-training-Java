package String_package;

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
		String s = "abbcdeb";
		System.out.println(s.indexOf('b'));
		System.out.println(s.indexOf('b', 2)); //2 is inclusive
		System.out.println(s.lastIndexOf('b'));
		System.out.println(s.indexOf('y')); // if not present it will return -1
		
		System.out.println(s.indexOf("de"));//indexOf can also search for the substring
		
		
	}
}
