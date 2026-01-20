package Assignment_18th_January;

public class q8 {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] rev = new int[arr.length];

        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;
        }

        for (int i = 0; i < rev.length; i++) {
            System.out.println(rev[i]);
        }
    }
}