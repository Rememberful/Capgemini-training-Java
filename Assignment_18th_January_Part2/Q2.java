package Assignment_18th_January_Part2;

public class Q2 {
	 public static void main(String[] args) {
	        int[][] mat1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] mat2 = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	        int rows = mat1.length;
	        int cols = mat1[0].length;

	        int[][] sum = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sum[i][j] = mat1[i][j] + mat2[i][j];
	            }
	        }

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(sum[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	} 	
