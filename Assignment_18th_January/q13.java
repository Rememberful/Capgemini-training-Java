package Assignment_18th_January;

public class q13 {
	 public static void main(String[] args) {
	        int[] arr = {10, 20, 10, 30, 20, 40, 50};
	        int n = arr.length;

	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    for (int k = j; k < n - 1; k++) {
	                        arr[k] = arr[k + 1];
	                    }
	                    n--;
	                    j--;
	                }
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            System.out.println(arr[i]);
	        }
	    }
	}