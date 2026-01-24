package Exception_package;

public class College {
	//Nested or Inner class
	
	static int a = 10;
	static class Student{ //Static to be accesible at one place only
		//Private inner class can be created, we can't create outer private class.
		//Outer class private variables can be accessed by inner class.
		public static void m1() {
			System.out.println(a);
		}
	}
	
	//Inner interface is also possible
	static interface Vehicle{
		//Static word allow
	}
	public static void main(String[] args) {
		Student.m1();
	}
}


// Outer  class College 
// create three inner class (student, trainer) and three interfaces (staffs)... 
// And normally do things like method, implements, extends
// add accordingly as per your knowledge

//use enum for Trainer, gender
