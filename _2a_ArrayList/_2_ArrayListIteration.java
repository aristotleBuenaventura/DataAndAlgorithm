package _1c_ArrayList;
import java.util.*;  

public class _2_ArrayListIteration {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("One");//Adding object in arraylist    
		list.add("Two");    
		list.add("Three");    
		list.add("Four");    
		//Traversing list through Iterator  
		Iterator itr=list.iterator();//getting the Iterator  
		while(itr.hasNext()){//check if iterator has the elements  
			System.out.println(itr.next());//printing the element and move to next  
		}  
	}  
}  
