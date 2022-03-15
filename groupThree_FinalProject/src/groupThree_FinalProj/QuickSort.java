package groupThree_FinalProj;

/* 
 * QuickSort
 * 
 * This class and the Payroll_JFrame are linked together so that the quick sort data structure
 * algorithm can work with JTable. The quick sort was used in the Payroll_JFrame to sort the attributes
 * of the tables through selecting the options in the JComboBox.
 * 
 */

import java.util.ArrayList;

public class QuickSort {
	
	private String query;
	private String type;
	
	public QuickSort(String query, String type)
	{
		this.query = query;
		this.type = type;
	}
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
		
    int partition(ArrayList<EmployeeDto> arr, int low, int high) { 
        String pivot = arr.get(high).getSortBy(this.query);  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
        	String element = arr.get(j).getSortBy(this.query);
        	boolean condition = this.type.contains("int") ? Integer.parseInt(element) < Integer.parseInt(pivot) : element.compareTo(pivot) < 0;
            if (condition) 
            { 
                i++; 
  
                EmployeeDto temp = arr.get(i); 
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            } 
        } 
 
        EmployeeDto temp = arr.get(i+1); 
        arr.set(i+1, arr.get(high));
        arr.set(high, temp);
        
        return i+1; 
    } 
  
 
    public void sort(ArrayList<EmployeeDto> arr, int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        }
     } 
}