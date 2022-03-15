package _1c_ArrayList;
import java.io.*; 
import java.util.*; 
import java.util.stream.*; 

class _5_ArrayListConstructor2 { 

	// Function to add all items 
	// from a collection to an ArrayList 
	public static <T> ArrayList<T> 
	createArrayList(List<T> collection) 
	{ 

		// Create an ArrayList 
		ArrayList<T> list = new ArrayList<T>(); 

		// Add all the items of Collection 
		// into this ArrayList 
		list.addAll(collection); 

		return list; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		List<Integer> collection1 = Arrays.asList(1, 2, 3); 
		System.out.println( 
				"ArrayList with all "
						+ "elements of collection "
						+ collection1 + ": "
						+ createArrayList(collection1)); 

		List<String> collection2 = Arrays.asList("One","Two","Three"); 
		System.out.println( 
				"ArrayList with all"
						+ " elements of collection "
						+ collection2 + ": "
						+ createArrayList(collection2)); 
	} 
} 


