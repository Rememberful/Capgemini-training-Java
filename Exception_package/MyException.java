package Exception_package;

public class MyException extends RuntimeException{
	public MyException(String message) {
		super(message); //message to parent constructor
	}
	public static void CheckAge(int otp) {
		if (otp > 0 && otp <=100) {
			System.out.println("OTP is valid");
		} else {
			throw new MyException(otp+" is invalid");
		}
	}
	public static void main(String[] args) {
		int otp1 = 100;
		CheckAge(otp1);
		try {
			int otp2 = -6;
			CheckAge(otp2);
		} catch(MyException e) {
			System.out.println("OTP is more than 100");
		}	
	}
}