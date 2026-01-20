package Assignment_18th_January;

public class q20 {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        int first = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = first;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}