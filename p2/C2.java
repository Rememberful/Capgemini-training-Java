package p2;
import p1.C1;
public class C2 extends C1 {
	public C2() {
		super();
	}
	public static void main(String[] args) {
//		C1 c1 = new C1();
		System.out.println(C1.s);
		C2 c2 = new C2();
		System.out.println(C2.s);
		
	}
}
