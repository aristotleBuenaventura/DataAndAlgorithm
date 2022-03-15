package _1c_ArrayList;
import java.util.ArrayList; 

public class _15_ArrayListClear {

    public static void main(String[] args) 
    { 
        // creating an Empty Integer ArrayList 
        ArrayList<Integer> arr = new ArrayList<Integer>(4); 
  
        // using add() to initialize values 
        // [1, 2, 3, 4] 
        arr.add(1); 
        arr.add(2); 
        arr.add(3); 
        arr.add(4); 
  
        // list initially 
        System.out.println("The list initially: " + arr); 
  
        // clear fucntion used 
        arr.clear(); 
  
        // list after clearing all elements 
        System.out.println("The list after using clear() method: " + arr); 
    } 
} 
