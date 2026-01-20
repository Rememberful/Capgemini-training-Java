package Classwork_16th_January;

public class Max {
	public int great(int a, int b) {
		return (a>b)?a:b;
	}
	public int great(int a, int b, int c) {
		return (a>b)?a:(b>c)?b:c;
	}
	public static void main(String[] args) {
		Max m = new Max();
		System.out.println(m.great(3, 4));
		System.out.println(m.great(3, 4, 8));
	}
}
