package Classwork_10th_january;

public class question2 {
	public static void compare(int a, int b, int c) {
		System.out.println((a>b)?(a>c?a:c):(b>c?b:c));
		System.out.println((a<b)?(a<c?a:c):(b<c?b:c));
	}
	
	public static void main(String[] args){
		compare(10,500,40);
	}
}
