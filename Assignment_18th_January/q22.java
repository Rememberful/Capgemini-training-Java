package Assignment_18th_January;

public class q22 {
	  public static void main(String[] args) {
	        int[] arr = {50, 20, 40, 10, 30};
	        int n = 2; // nth largest element to find

	        // Sort the array in ascending order
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println(arr[arr.length - n]);
	    }
	}