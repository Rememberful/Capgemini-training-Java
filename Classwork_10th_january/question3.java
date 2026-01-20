package Classwork_10th_january;

public class question3 {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		int a = 40;
		int b = 30;
		switch ('+') {
		case '+': {
			System.out.println(add(a, b));
			break;
		}
		case '-': {
			System.out.println(sub(a, b));
			break;
		}

		}

	}
}
