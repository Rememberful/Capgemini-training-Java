package Classwork_20th_Januaruy;

class Example {
	private static String a = "Private Variable";
	
	private static void m1() {
		System.out.println("Private Method");
	}
	
	private Example() {
		System.out.println("Private Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		Example e = new Example();
	}
}
