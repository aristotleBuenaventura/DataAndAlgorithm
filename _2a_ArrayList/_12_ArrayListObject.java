package _1c_ArrayList;
import java.io.*; 
import java.util.ArrayList; 

public class _12_ArrayListObject {
public static void main(String[] args) 
    { 
  
        // create an empty array list with an initial capacity 
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5); 
  
        // use add() method to add elements in the list 
        arrlist.add(15); 
        arrlist.add(20); 
        arrlist.add(25); 
  
        // prints all the elements available in list 
        for (Integer number : arrlist) { 
            System.out.println("Number = " + number); 
        } 
    } 
} 