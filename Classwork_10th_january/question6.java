package Classwork_10th_january;

//Armstrong number
public class question6 {

	// Method to calculate power
    public static int Power(int b, int p) {
        int pow = 1;
        while (p > 0) {
            pow = pow * b;
            p--;
        }
        return pow;
    }

    // Method to count number of digits
    public static int count(int n) {
        int n2 = 0;
        while (n > 0) {
            n2++;
            n = n / 10;
        }
        return n2;
    }

    public static void main(String[] args) {

        int num = 1634;        // number to check
        int temp = num;
        int digits = count(num);
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + Power(rem, digits);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
