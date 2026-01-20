package Assignment_14th_january;

public class q18 {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2; // Index to remove

        int n = arr.length;
        int[] newArr = new int[n - 1];

        for (int i = 0, j = 0; i < n; i++) {
            if (i == index) {
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}