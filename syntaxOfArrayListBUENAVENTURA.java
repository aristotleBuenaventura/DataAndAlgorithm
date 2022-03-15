package _21_Stack;

import java.util.ArrayList;

public class syntaxOfArrayListBUENAVENTURA {
	public static void main(String[] args) {
	
	 int arrayListSize1=5; //capacity as 5 
	 

	 ArrayList<String> myFamily = new ArrayList<String>(arrayListSize1);  //Creating arraylist
	 
	 myFamily.add("Aristotle Buenaventura");  
	 myFamily.add("Carilyn Lagarto");  
	 myFamily.add("Alliyah Buenaventura");  
	 myFamily.add("Albert Buenaventura"); 
	 myFamily.add("Sheldon Cooper");
	 myFamily.remove("Sheldon Cooper");
	 myFamily.add("Alfredo Buenaventura");
  
     //iterating ArrayList
	 // Using the Get method and the 
	 // for loop 
     for(int i=0; i < myFamily.size();i++)  
        System.out.println(myFamily.get(i));  
     }  
	
	 
	
}
