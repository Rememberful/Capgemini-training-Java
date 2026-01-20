package abstraction;

interface Test {
	
	//Variable
	public static final int a = 10;
	int b = 30; // public static is by default used here.
	
	private void m1() {
		System.out.println("Pr Method");
	}
	default void m2() {
		System.out.println("Def Method");
		m1();
	}
	public static void m3() {
		System.out.println("Static Method");
	}
}

