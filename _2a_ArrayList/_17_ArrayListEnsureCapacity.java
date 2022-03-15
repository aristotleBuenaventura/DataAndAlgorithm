package _1c_ArrayList;


import java.util.*; 

public class _17_ArrayListEnsureCapacity {
    public static void main(String[] argv) 
        throws Exception 
    { 
  
        try { 
  
            // Creating object of ArrayList<Integer> 
            ArrayList<Integer> 
                arrlist = new ArrayList<Integer>(); 
  
            // adding element to arrlist 
            arrlist.add(10); 
            arrlist.add(20); 
            arrlist.add(30); 
            arrlist.add(40); 
  
            // Print the ArrayList 
            System.out.println("ArrayList: "
                               + arrlist); 
  
            // ensure that the ArrayList 
            // can hold upto 5000 elements 
            // using ensureCapacity() method 
            arrlist.ensureCapacity(5000); 
  
            // Print 
            System.out.println("ArrayList can now"
                               + " surely store upto"
                               + " 5000 elements."); 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 