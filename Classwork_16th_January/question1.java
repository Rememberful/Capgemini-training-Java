package Classwork_16th_January;

public class question1 {
	
	public static void add(float a, int b) {
		System.out.println("Integer datatype:");
		System.out.println(a+b);
	}
	
	public static void add(float a, float b) {
		System.out.println("Float datatype:");
		System.out.println(a+b);
	}
	
	public static void add(double a, double b) {
		System.out.println("Double datatype:");
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		add(3,4);
		add(3.0f,4.0f);
		add(0.0d, 0.4d);
	}
}


