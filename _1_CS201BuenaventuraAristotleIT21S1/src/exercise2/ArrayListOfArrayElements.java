package exercise2;

// Name: Aristotle Buenaventura
// Section: IT12S1

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListOfArrayElements {
	public static void main (String[] args) {
		
		// Calling the methods
		numericalValues(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Number of Arrays: ", "Array Elements of Numericals",JOptionPane.INFORMATION_MESSAGE))); // Getting the size of the array for numericalValues
		stringValues(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Number of Arrays: ", "Array Elements of Strings",JOptionPane.INFORMATION_MESSAGE))); // Getting the size of the array for stringValues
			
		
	}
	
	public static void numericalValues(int arraySizeOfNumerals) {

		 // Declaration and instantiation of Array
		int arrayElementNumerals[] = new int[arraySizeOfNumerals];
		 
		 // for loop for accepting values
		for(int i=0; i < arrayElementNumerals.length; i++) {
			arrayElementNumerals[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
			}
		
		System.out.println("Size of the array: " + arraySizeOfNumerals);
		System.out.println("Initial Numerical Array Elements: ");
		
		// Displaying the initial array elements
		for(int num: arrayElementNumerals) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		// Declaration and instantiation of ArrayList
		ArrayList<Integer> arrayListNumerals =new ArrayList<Integer>(); //GOODS!!!
		
		// Converting the array to arrayList
		for( int i: arrayElementNumerals) {
			arrayListNumerals.add(i);
		}
		
		System.out.println("Array converted to ArrayList: ");
		
		// Displaying the converted array
		for(int num: arrayListNumerals) {
			System.out.print(num+" ");
		}
		 
		System.out.println();
		System.out.println();
		
		System.out.println("ArrayList Methods");
		
		// Applying some ArrayList methods
		arrayListNumerals.add(23); //This method is used to append a specific element to the end of a list.
		arrayListNumerals.add(14); //This method is used to append a specific element to the end of a list.
		arrayListNumerals.add(89); //This method is used to append a specific element to the end of a list.
		arrayListNumerals.add(105); //This method is used to append a specific element to the end of a list.
		arrayListNumerals.add(35); //This method is used to append a specific element to the end of a list.
		arrayListNumerals.add(10); //This method is used to append a specific element to the end of a list.
		arrayListNumerals.add(76); //This method is used to append a specific element to the end of a list.
		arrayListNumerals.add(56); //This method is used to append a specific element to the end of a list.
		arrayListNumerals.add(55); //This method is used to append a specific element to the end of a list.
		arrayListNumerals.add(2,45); // This method is used to insert a specific element at a specific position index in a list.
		arrayListNumerals.remove(0); //Removes the first occurrence of the specified element from this list, if it is present.
		arrayListNumerals.remove(4); //Removes the first occurrence of the specified element from this list, if it is present
		arrayListNumerals.set(0,100); //Replaces the element at the specified position in this list with the specified element.
		arrayListNumerals.trimToSize(); //This method is used to trim the capacity of the instance of the ArrayList to the list’s current size.
		System.out.println("Does the ArrayList contains 5?: " + arrayListNumerals.contains(5)); //Returns true if this list contains the specified element.
		System.out.println("What element is in index 1?: " + arrayListNumerals.get(1)); //Returns the element at the specified position in this list.
		System.out.println("Is the ArrayList empty?: " + arrayListNumerals.isEmpty()); //Returns true if this list contains no elements.
		System.out.println("What is the size of the ArrayList?: " + arrayListNumerals.size()); //Returns the number of elements in this list.
		System.out.println("What are the elements inside from index 0 to 2?: " + arrayListNumerals.subList(0,6)); //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
		System.out.println("What is the index of element 76?: " + arrayListNumerals.indexOf(76)); //The index the first occurrence of a specific element is either returned or -1 in case the element is not in the list.
		
		
		
		
		
		System.out.println("Updated ArrayList after implementing some ArrayList methods: ");
		
		// Displaying the updated ArrayList
		for(int num: arrayListNumerals) {
			System.out.print(num+" ");
		}
		 
		System.out.println();
		System.out.println();
		
				

	}
	
		
		
	public static void stringValues(int arraySizeOfString) {
		
		// Declaration and instantiation of Array
		String arrayElementStrings[] = new String[arraySizeOfString];
		
		// for loop for accepting values
		for(int i=0; i < arrayElementStrings.length; i++) {
			arrayElementStrings[i] = JOptionPane.showInputDialog("Enter a letter: ").toUpperCase();
			}
		
		System.out.println("Size of the array: " + arraySizeOfString);
		System.out.println("Initial Numerical Array Elements: ");
		
		// Displaying the initial array elements
		for(String letter: arrayElementStrings) {
			System.out.print(letter+" ");
		}
		
		System.out.println();
		
		// Declaration and instantiation of ArrayList
		ArrayList<String> arrayListStrings =new ArrayList<String>(); //GOODS!!!
		
		// Converting the array to arrayList
		for( String i: arrayElementStrings) {
			arrayListStrings.add(i);
		}
		
		System.out.println("Array converted to ArrayList: ");
		
		// Displaying the converted array
		for(String letter: arrayListStrings) {
			System.out.print(letter+" ");
		}
		 
		System.out.println();
		System.out.println();
		
		System.out.println("ArrayList Methods");

		// Applying some ArrayList methods
		arrayListStrings.add("A"); //This method is used to append a specific element to the end of a list.
		arrayListStrings.add("B"); //This method is used to append a specific element to the end of a list.
		arrayListStrings.add("Y"); //This method is used to append a specific element to the end of a list.
		arrayListStrings.add("D"); //This method is used to append a specific element to the end of a list.
		arrayListStrings.add("E"); //This method is used to append a specific element to the end of a list.
		arrayListStrings.add("F"); //This method is used to append a specific element to the end of a list.
		arrayListStrings.add("G"); //This method is used to append a specific element to the end of a list.
		arrayListStrings.add("H"); //This method is used to append a specific element to the end of a list.
		arrayListStrings.add("I"); //This method is used to append a specific element to the end of a list.
		arrayListStrings.add(2,"J"); // This method is used to insert a specific element at a specific position index in a list.
		arrayListStrings.remove(0); //Removes the first occurrence of the specified element from this list, if it is present.
		arrayListStrings.remove(4); //Removes the first occurrence of the specified element from this list, if it is present
		arrayListStrings.set(0,"Z"); //Replaces the element at the specified position in this list with the specified element.
		arrayListStrings.trimToSize(); //This method is used to trim the capacity of the instance of the ArrayList to the list’s current size.
		System.out.println("Does the ArrayList contains F?: " + arrayListStrings.contains("F")); //Returns true if this list contains the specified element.
		System.out.println("What element is in index 1?: " + arrayListStrings.get(1)); //Returns the element at the specified position in this list.
		System.out.println("Is the ArrayList empty?: " + arrayListStrings.isEmpty()); //Returns true if this list contains no elements.
		System.out.println("What is the size of the ArrayList?: " + arrayListStrings.size()); //Returns the number of elements in this list.
		System.out.println("What are the elements inside from index 0 to 2?: " + arrayListStrings.subList(0,6)); //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
		System.out.println("What is the index of element I?: " + arrayListStrings.indexOf("I")); //The index the first occurrence of a specific element is either returned or -1 in case the element is not in the list.
		
		
		System.out.println("Updated ArrayList after implementing some ArrayList methods: ");
		
		// Displaying the updated ArrayList
		for(String letter: arrayListStrings) {
			System.out.print(letter+ " ");
		}		
		
	}
	
} // End of program
		


























