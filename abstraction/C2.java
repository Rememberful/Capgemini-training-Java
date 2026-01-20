package abstraction;

public class C2 extends C1 implements I1, I2 {
	public static void main(String[] args) {
		
		C1 c1 = new C2();
		I2 i2 = new C2();
	}
}

class C1{
	
}

interface I1 extends I2, I3{
	
}

interface I2{
	
}

interface I3{
	
}