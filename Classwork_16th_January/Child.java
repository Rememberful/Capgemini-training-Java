package Classwork_16th_January;

public class Child extends Parent {
	@Override
	public void home() {
		System.out.println("Red");
	}
	
	public void home2() {
		System.out.println("Red");
	}
	public void bike() {
		System.out.println("BMW");
	}
	public static void main(String[] args) {
		Parent p = new Child();
		p.home();
		p.home2();
	}
}
