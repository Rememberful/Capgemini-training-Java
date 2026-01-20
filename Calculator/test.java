package Calculator;

public class test {
    public static void main(String[] args) {
    	int a = 10;
        int b = 5;
        char op = '-';

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
            	System.out.println("None matched");
        }
    }
}
