package Linked_list;
import java.util.Stack;
public class StackExample {
	 public static void main(String[] args) {

	        Stack<String> stack = new Stack<>();

	        // Push elements
	        stack.push("A");
	        stack.push("B");
	        stack.push("C");

	        // Peek top element -> just see the top most 
	        System.out.println(stack.peek());   // C
	        
	        System.out.println(stack);  
	        // Pop element -> remove the top most i.e., the one at the end of the stack (or added the end)
	        System.out.println(stack.pop());    // C

	        // Stack after pop
	        System.out.println(stack);           // [A, B]
	    }
}
