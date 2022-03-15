package _1c_ArrayList;

import java.io.*; 
import java.util.ArrayList; 

public class _13_ArrayListAddAll {
    public static void main(String args[]) 
    { 
  
        // create an empty array list1 with initial  
        // capacity as 5 
        ArrayList<Integer> arrlist1 =  
                           new ArrayList<Integer>(5); 
  
        // use add() method to add elements in the list 
        arrlist1.add(12); 
        arrlist1.add(20); 
        arrlist1.add(45); 
  
        // prints all the elements available in list1 
        System.out.println("Printing list1:"); 
        for (Integer number : arrlist1)  
            System.out.println("Number = " + number);         
  
        // create an empty array list2 with an initial 
        // capacity 
        ArrayList<Integer> arrlist2 =  
                             new ArrayList<Integer>(5); 
  
        // use add() method to add elements in list2 
        arrlist2.add(25); 
        arrlist2.add(30); 
        arrlist2.add(31); 
        arrlist2.add(35); 
  
        // let us print all the elements available in  
        // list2 
        System.out.println("Printing list2:"); 
        for (Integer number : arrlist2)  
            System.out.println("Number = " + number);         
  
        // inserting all elements, list2 will get printed 
        // after list1 
        arrlist1.addAll(arrlist2); 
  
        System.out.println("Printing all the elements"); 
        // let us print all the elements available in  
        // list1 
        for (Integer number : arrlist1)  
            System.out.println("Number = " + number);         
    } 
} 