package Assignment_18th_January_Part2;

public class Q3 {
	public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] mat2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int rows2 = mat2.length;
        int cols2 = mat2[0].length;

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        int[][] product = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}