package Exception_package;

public class Demo {
	public static void main(String[] args) {
//		System.out.println(3);
//		String a = "xyz";
//		System.out.println(a/charAt(10));
//		System.out.println(2/0); //interpreter will not show this one.

		// NullPointerException
//		String s = null;
//		System.out.println(s.toLowerCase());

//		System.out.println("First");
		// Introducing the try catch block
		//Arithmetic exception
//		try {
//			System.out.println("hi"); // this will get printed
//			System.out.println(2 / 0); // exception because we divide by 0
//			System.out.println("bye"); // this will not get printed
//			System.out.println(4 / 0);
//			System.out.println("Yez");
//		} catch (ArithmeticException e) { // type of exception and reference variable
//			System.out.println("Don't divide by zero");
//		}
//		System.out.println("8");

		//2
		//Array index out of bound exception
//		try {
//			int[] arr = { 1, 2, 3 };
//			System.out.println(arr[5]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Index Out Of Bounds Exception caught");
//		}

		//3
		//Null pointer exception
//		try {
//			String str = null;
//			System.out.println(str.length());
//		} catch (NullPointerException e) {
//			System.out.println("Null Pointer Exception caught");
//		}
		
		//4
		//String index out of bound exception
//		try {
//            String text = "Java";
//            // Accessing invalid index
//            char ch = text.charAt(10);
//            System.out.println(ch);
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("String Index Out Of Bounds Exception caught");
//        }
		
//		try {
//			int[] arr = { 1, 2, 3 };
//			System.out.println(arr[5]);
//		} catch (ArithmeticException e) {
//			System.out.println("P");
//		}
		
		
		//Case where exception in try is different than intended in the catch
//		try {
//			System.out.println(2/0);
//		} catch(Throwable e) { //Exception or throwable can be used in general
//			System.out.println("We used Exception class as the type of exception");
//		} //catch(Throwable e) {
////			System.out.println("yes");
//		}

		// Checked exception example 1
//		System.out.println("hi");
//		try {
//			Thread.sleep(3000); //Interrupted exception (may cause)
//		} catch(InterruptedException e) {
//			System.out.println("Sleep method called"); 
//		}
//		System.out.println("bye"); 
		
		//Checked exception example 2
//		System.out.println("hi");
//		try {
//			Class.forName("loops.question"); ///forName will cause the exception ClassNotFoundException
////			Class.forName("loops.questio"); //this will let the catch to work
//		} catch(ClassNotFoundException e) {
//			System.out.println("Class info is wrong");
//		}
//		System.out.println("bye"); 
		
		//Multiple catch blocks with 
//		System.out.println("hi");
//		try {
//			Class.forName("loops.question"); ///forName will cause the exception ClassNotFoundException
////			Class.forName("loops.questio"); //this will let the catch to work
//		} catch(ClassNotFoundException e) {
//			System.out.println("Class info is wrong");
//		} 
//		System.out.println("bye"); 
//		
//		try {
//			
//		} catch(//Child Exception){
//		
//		} catch(//parent Exception){
//				
//		}
		
		//Try catch, with multiple catch
//		System.out.println("hi");
//		try {
//			Class.forName("loops.quesion"); ///forName will cause the exception ClassNotFoundException
////			Class.forName("loops.questio"); //this will let the catch to work
//		} catch(ClassNotFoundException e) {
//			System.out.println("Class info is wrong");
//		} catch(ArithmeticException e) {
//			System.out.println("Something went wrong"); //since if first one is executed the next will not get executed
//		}
//		System.out.println("bye");
		
		
		try {
			System.out.println(3/0);
		} catch(ArithmeticException e) {
			System.out.println("Handled using catch block...");
			System.out.println("Hey");
		} finally { // runs at any condition whether exception happened/handled or not
			// finally is used for closing database connection
			System.out.println("Finally block is used...");
		}		
	}
}
