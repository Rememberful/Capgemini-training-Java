package Classwork_10th_january;

public class question4 {
	
	public static boolean isPrime(int n) {
		for(int i = 2; i<=n/2; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) { 
//		int n = 7;
//		for(int i = 2; i<=n/2; i++) {
//			if(n%i==0) {
//				System.out.println("Not a prime number");
//				return;
//			}
//		}
//		System.out.println("PN");
		
		if(isPrime(11)) {
			System.out.println("P");
		}
		else {
			System.out.println("NP");
		}
	}
}
