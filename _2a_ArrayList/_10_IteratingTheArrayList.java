package _1c_ArrayList;

import java.util.ArrayList;

public class _10_IteratingTheArrayList {
	public static void main(String args[]) 
	{ 
		ArrayList<String> al = new ArrayList<>(); 

		al.add("TIP"); 
		al.add("TIP"); 
		al.add(1, "Dear"); 

		// Using the Get method and the 
		// for loop 
		for (int i = 0; i < al.size(); i++) { 

			System.out.print(al.get(i) + " "); 
		} 

		System.out.println(); 

		// Using the for each loop 
		for (String str : al) 
			System.out.print(str + " "); 
	} 
} 


