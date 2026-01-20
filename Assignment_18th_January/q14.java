package Assignment_18th_January;

public class q14 {
	public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 50};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                arr[i] = -1; // mark unique elements
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                System.out.println(arr[i]);
            }
        }
    }
}