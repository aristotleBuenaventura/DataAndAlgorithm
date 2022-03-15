package exercise2;

import java.util.ArrayList;
import java.util.Stack;


public class StackClass {
	
	// Instantiate a global variable size
	public static byte size=10; 
	
	public static void stackList(){
	
		// Declaration and instantiation of ArrayList
		ArrayList<Integer> randomNumber =new ArrayList<Integer>(size);
		
		// 10 randomly generated numbers from 1 – 100 that will be added to the ArrayList
		for(int i=0;i<size;i++) {
			int random=(int)(Math.random()*100);
			randomNumber.add(random);
		}
		
		// Printing the ArrayList
		System.out.println("ArrayList of 10 randomly generated numbers from 1 – 100: "+ randomNumber);
		System.out.println();
		
		// Passing the elements of ArrayList to the method addStack
		StackClass.addStack(randomNumber);
		
		
	}
	
	public static void addStack(ArrayList<Integer> randomStack) {
		
		// Declaration and instantiation of Stack
		Stack<Integer> StackList = new Stack<Integer>();
		
		// Pushing all the value of the ArrayList to the Stack
		for(Integer eachRandomStack: randomStack) {
			StackList.push(eachRandomStack);
		}
		
		// Printing the Stack
		System.out.println("10 ArrayList Elements push to the Stack: "+ StackList);
		System.out.println();

		// Passing the elements of StackList to the method resultStack
		StackClass.resultStack(StackList);
		
		
	}
	
	public static void resultStack(Stack<Integer> StackList) {
		
		// Removing every element of the Stack
		for(int i=0;i< size;i++) {
			// Printing every element that has been popped
			System.out.println("Popped element: "+ StackList.pop());
		}
		
		
		// printing the updated Stack
		System.out.println();
		System.out.print("Stack after pop operation: "+ StackList);
		
	}
} // End of the program
