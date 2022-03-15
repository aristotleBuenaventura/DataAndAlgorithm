package _1c_ArrayList;
import java.util.ArrayList; 

public class _22_ArrayListLastIndexOf {
	public static void main(String[] args) 
	{ 

		// creating an Empty Integer ArrayList 
		ArrayList<Integer> arr = new ArrayList<Integer>(7); 

		// using add() to initialize values 
		arr.add(10); 
		arr.add(20); 
		arr.add(30); 
		arr.add(40); 
		arr.add(30); 
		arr.add(30); 
		arr.add(40); 

		System.out.println("The list initially " + arr); 

		// last index of 30 

		int element = arr.lastIndexOf(30); 
		if (element != -1) 
			System.out.println("the lastIndexof of" +  
					" 30 is " + element); 
		else
			System.out.println("30 is not present in" +  
					" the list"); 

		// last index of 100 
		element = arr.lastIndexOf(100); 
		if (element != -1) 
			System.out.println("the lastIndexof of 100" +  
					" is " + element); 
		else
			System.out.println("100 is not present in" +  
					" the list"); 
	} 
} 