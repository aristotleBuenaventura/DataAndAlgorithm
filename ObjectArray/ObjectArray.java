package ObjectArray;

// Name: Aristotle Buenaventura
// Section: IT12S1

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayElement implements Comparable<ArrayElement>{ 
	//Declaration of variables
	public int number;
	public String letter;
	
	// Object Array
	ArrayElement(int number, String letter) { 
		this.number = number;
		this.letter = letter;
	}

	
	public int compareTo(ArrayElement object) {
		return this.number - object.number;
	}
}

public class ObjectArray {
	 public static void main (String[] args) {
		  
		 // Size of the array
		 int arraySize= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Arrays: ", "Array Elements",JOptionPane.INFORMATION_MESSAGE));
		 
		 // Declaration and instantiation of Array
		 ArrayElement arrayElement[] = new ArrayElement[arraySize];
		 
		 System.out.println("Enter Size of the array: " + arraySize);
		 
		 System.out.print("Enter " + arraySize +  " elements: ");
		 
		 // for loop for accepting values
		 for(int i=0; i < arrayElement.length; i++) {
			 arrayElement[i] = new ArrayElement(Integer.parseInt(JOptionPane.showInputDialog("Enter a number: ")), JOptionPane.showInputDialog("Enter a letter").toUpperCase());
			 System.out.print(arrayElement[i].number + " " + arrayElement[i].letter); // Displaying the array
			 if (i<arrayElement.length-1) {
				 System.out.print(", ");
			 }
		 }
		 
		 System.out.println();
		 
		 System.out.print("Reverse Order: ");
		 for (int i=arrayElement.length-1; i >= 0; i--) { // Displaying the array in reverse order
			 System.out.print(arrayElement[i].number + " " + arrayElement[i].letter);
			 if (i>0) {
				 System.out.print(", ");
			 }
		 }
		 
		 System.out.println();
		 
		 Arrays.sort(arrayElement); // Sort method to arrange the array in ascending order
		 
		 System.out.print("Ascending Order: ");// Displaying the array in ascending order
		 for(int i=0; i < arrayElement.length; i++) {
			 System.out.print(arrayElement[i].number + " " + arrayElement[i].letter);
			 if (i<arrayElement.length-1) {
				 System.out.print(", ");
			 }
		 }
	 }
}
