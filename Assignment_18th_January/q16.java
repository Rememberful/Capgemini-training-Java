package Assignment_18th_January;

public class q16 {
	public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 8, 13, 21, 34, 7};

    for (int i = 0; i < arr.length; i++) {
        if (isFibonacci(arr[i])) {
            System.out.println(arr[i]);
        }
    }
}

static boolean isFibonacci(int n) {
    int x1 = 5 * n * n + 4;
    int x2 = 5 * n * n - 4;

    return isPerfectSquare(x1) || isPerfectSquare(x2);
}

static boolean isPerfectSquare(int n) {
    int s = (int) Math.sqrt(n);
    return s * s == n;
}
}