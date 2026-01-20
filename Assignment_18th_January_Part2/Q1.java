package Assignment_18th_January_Part2;

public class Q1 {
	public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {5, 25, 15},
            {40, 35, 50}
        };

        int largest = arr[0][0];
        int smallest = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}