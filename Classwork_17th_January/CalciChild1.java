package Classwork_17th_January;

public class CalciChild1 extends Calculator {
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int multi(int a, int b) {
		return a*b;
	}
	
	public void m1() {
		//This method belong to child and can't be accessed by parent
		// Child method
		System.out.println("Method");
		
	}
	
	public static void main(String[] args) {
		Calculator c = new CalciChild1(); //Upcasting //CHild object created
		System.out.println(c.add(5, 5));  //child will add return
		System.out.println(c.sub(5, 5));  //child will return
		//c.m1(); // not possible as we have done the UC
	}
}
