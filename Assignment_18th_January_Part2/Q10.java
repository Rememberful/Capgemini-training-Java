package Assignment_18th_January_Part2;

public class Q10 {
	public static void main(String[] args) {
        double[][] mat = {
            {2, -1, 3},
            {4, 2, 1},
            {6, 1, -2}
        };

        int n = mat.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mat[i][i] == 0) continue; // avoid division by zero
                double factor = mat[j][i] / mat[i][i];
                for (int k = i; k < n; k++) {
                    mat[j][k] -= factor * mat[i][k];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.2f ", mat[i][j]);
            }
            System.out.println();
        }
    }
}