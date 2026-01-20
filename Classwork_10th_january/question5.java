package Classwork_10th_january;

//Power 
public class question5 {

	public static int Power(int b, int p) {
		int pow = 1;
		while(p>0) {
			pow = pow*b;
			p--;
		}
		return pow;
	}
	public static void main(String[] args) { 
		System.out.println(Power(3,4));
	}
}
	
