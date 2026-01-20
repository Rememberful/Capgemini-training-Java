package Assignment_18th_January_Part2;

public class Q7 {
	public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("  "); // space for non-boundary elements
                }
            }
            System.out.println();
        }
    }
}