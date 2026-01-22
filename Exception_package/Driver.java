package Exception_package;

public class Driver {
	public static void main(String[] args) {
//		//m1();
//		String s="xyz";
//		while(true) {
//			s=s+s;//OutOfMemoryError
//		}
//	}
//	public static void m1() {
//		System.out.println("hi");
//		m1();//stack over flow error
//	}
		
		//wrapper : as it is wrapping the primitive to NP and vice-versa
//		int n = 10;
//		Integer i = n; //Auto-boxing -> primitive is converted to object
//		int n2 = i; // Un-boxing as we again made it Primitive 
		
//		Integer i2 = 90; //auto boxing, as 90 by default be integer (primitive) and which get converted to Non-primitive
//		
//		Character c1 = 'a';
//		System.out.println(c1);
//		
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		
		//string to integer
//		System.out.println(Integer.valueOf("123"));
//		Integer i = Integer.valueOf("123"); //.valueOf converts string to integer
//		System.out.println(i+1);
		
//		Boolean b = Boolean.valueOf("tRue"); //if it is not boolean then it will return false 
//		System.out.println(b);
		
		int s = Integer.parseInt("12");// convert string to int
		System.out.println(s);
		
}}
