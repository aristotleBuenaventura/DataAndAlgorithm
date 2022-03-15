package _1c_ArrayList;
import java.util.*; 

public class _3_ArrayListForEachExample {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("One");//Adding object in arraylist    
		list.add("Two");    
		list.add("Three");    
		list.add("Four");    
		//Traversing list through for-each loop  
		for(String fruit:list)    
			System.out.println(fruit);    

	}  
}  

