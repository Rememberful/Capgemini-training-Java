package loops;
import java.util.Scanner;

public class question {
	public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);

//	        System.out.print("n: ");
//	        int n = sc.nextInt();
//
//	        while (n >= 1) {
//	            System.out.println(n);
//	            n--;
//	        }
	        
//	        int n = 10;
//	        while(n<=10 && n>0 ) {
//	        	if(n%2==0) {
//	        		System.out.println(n);
//		  
//	        	}
//	        	n--;
//	        }
	        
//	        int i = 1;
//	        int n = 3;
//	        do {
//	        	System.out.println(i);
//	        	i++;
//	        }
//	        while(i<=n);
	        
	        // Sum from 1 to n
//	        int i = 1;
//	        int n = 10;
//	        int sum = 0;
//	        do {
//	        	sum = sum+i;
//	        	i++;
//	        } while(i<=n);
//	        System.out.println(sum);
	        
	        // sum of digits of number
//	        int n1 = 111;
//	        int sum1 = 0;
//	        do {
//	        	int last_digit = n1%10;
//	        	sum1 = sum1+last_digit;
//	        	n1 = n1/10;
//	        } while(n1>0);
//	        System.out.println(sum1);
	        
	        //Calculating factors of n
//	        int count = 0;
//	        int n3 = 10;
//	        for(int i = 1; i<=n3; i++) {
//	        	if(n3%i==0) {
//	        		count++;
//	        	}
//	        }
//	        System.out.println(count);
		
		// Check if number is prime or not 
		int n = 5;
		int count = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	    }
}
