package Exception_package;

public class Throws_exception {
	public static void main(String[] args) {
		try {
			m1();
		} catch(Exception e) {
			System.out.println("Handled");
		}
	}
	
	public static void m1() throws Exception{
		System.out.println("hi");
		System.out.println("loops.question");
		System.out.println(4/0);
		System.out.println("bye");
	}
}


