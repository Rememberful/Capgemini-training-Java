package conditionals;

public class question1 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 40;
		int big = (a>b)?a:b;
		if (big>c) {
			System.out.println(big);
		}
		if (big>d) {
			System.out.println(big);
		}
	}
}
