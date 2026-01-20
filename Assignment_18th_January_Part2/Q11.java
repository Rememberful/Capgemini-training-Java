package Assignment_18th_January_Part2;

public class Q11 {
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

	        int trace1 = 0;
	        int trace2 = 0;

	        for (int i = 0; i < mat1.length; i++) {
	            trace1 += mat1[i][i];
	            trace2 += mat2[i][i];
	        }

	        if (trace1 == trace2) {
	            System.out.println("The traces of both matrices are equal.");
	        } else {	
	            System.out.println("The traces of both matrices are not equal.");
	        }
	    }
	}