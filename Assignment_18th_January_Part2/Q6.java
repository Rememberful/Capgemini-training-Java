package Assignment_18th_January_Part2;

public class Q6 {
	public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = mat.length;

        System.out.print("Main diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        System.out.print("Secondary diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][n - 1 - i] + " ");
        }
    }
}