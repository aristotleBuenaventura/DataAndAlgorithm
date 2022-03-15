package _1c_ArrayList;

import java.util.ArrayList;

public class _9_RemovingElementsFromArrayList {

	public static void main(String[] args) {		 
		ArrayList<String> al = new ArrayList<>(); 

		al.add("TIP"); 
		al.add("TIP"); 
		al.add(1, "Dear"); 

		System.out.println("Initial ArrayList " + al); 

		al.remove(1); 

		System.out.println("After the Index Removal " + al); 

		al.remove("TIP"); 

		System.out.println("After the Object Removal " + al); 
	} 
} 