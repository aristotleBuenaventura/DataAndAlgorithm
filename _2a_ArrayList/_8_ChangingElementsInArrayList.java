package _1c_ArrayList;

import java.util.ArrayList;

public class _8_ChangingElementsInArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); 

		al.add("TIP"); 
		al.add("TIP"); 
		al.add(1, "TIP"); 

		System.out.println("Initial ArrayList " + al); 

		al.set(1, "Dear"); 

		System.out.println("Updated ArrayList " + al); 
	} 
} 


