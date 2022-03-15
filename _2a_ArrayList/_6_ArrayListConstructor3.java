package _1c_ArrayList;

import java.util.ArrayList;

public class _6_ArrayListConstructor3 {
	public static void main (String ...args) {
		ArrayList<Integer> aListNumbers = new ArrayList<Integer>(10);       
		System.out.println("ArrayList size : " + aListNumbers.size());		

		//add 10 elements to ArrayList
		aListNumbers.add(1);
		aListNumbers.add(2);
		aListNumbers.add(3);
		aListNumbers.add(4);
		aListNumbers.add(5);
		aListNumbers.add(6);
		aListNumbers.add(7);
		aListNumbers.add(8);
		aListNumbers.add(9);
		aListNumbers.add(10);


		System.out.println("ArrayList contains: " + aListNumbers);        
		System.out.println("ArrayList size : "   + aListNumbers.size());

		//add one more element beyond the initial capacity
		aListNumbers.add(11);    

		System.out.println("ArrayList contains: " + aListNumbers);        
		System.out.println("ArrayList size : " + aListNumbers.size());

	}
}


