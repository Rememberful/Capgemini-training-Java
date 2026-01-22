package Exception_package;

public class AgeException extends RuntimeException {
	public AgeException(String message) {
		super(message); //message to parent constructor
	}

	public static void CheckAge(int age) {
		if (age > 0) {
			System.out.println("Age is valid");
		} else {
			throw new AgeException(age+" is invalid");
		}
	}
	public static void main(String[] args) {
		int age1 = 10;
		CheckAge(age1);
		try {
			int age2 = -6;
			CheckAge(age2);
		} catch(AgeException e) {
			System.out.println("Age");
		}
		
	}
}
