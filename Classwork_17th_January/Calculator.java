package Classwork_17th_January;

public abstract class Calculator {
	public abstract int add(int a, int b); //logic is now known
	public abstract int multi(int a, int b);
	public int sub(int a, int b) { // here logic is known 
		return a-b;
	}
}
