package Assignment_18th_January;

public class q9 {
	public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 10};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}