package Assignment_18th_January_Part2;

public class Q5 {
	  public static void main(String[] args) {
	        int[][] mat = {
	            {1, 0, 0},
	            {0, 1, 0},
	            {0, 0, 1}
	        };

	        int rows = mat.length;
	        int cols = mat[0].length;

	        boolean isIdentity = true;

	        if (rows != cols) {
	            isIdentity = false;
	        } else {
	            for (int i = 0; i < rows; i++) {
	                for (int j = 0; j < cols; j++) {
	                    if (i == j && mat[i][j] != 1) {
	                        isIdentity = false;
	                        break;
	                    } else if (i != j && mat[i][j] != 0) {
	                        isIdentity = false;
	                        break;
	                    }
	                }
	                if (!isIdentity) {
	                    break;
	                }
	            }
	        }

	        if (isIdentity) {
	            System.out.println("The matrix is an identity matrix.");
	        } else {
	            System.out.println("The matrix is not an identity matrix.");
	        }
	    }
	}