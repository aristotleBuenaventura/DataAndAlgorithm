package groupThree_FinalProj;

/* 
 * Queue
 * 
 *This class and the Payroll JFrame are linked so that the enqueue operation 
 *in the Payroll JFrame class can be used to demonstrate the implementation of Queue
 * in the Payroll system through the use of the Add button.
 * 
 */

public class Queue {

	private Node front, rear; 
	private int currentSize; // number of items

	//class to define linked node
	private class Node
	{ 
		Object[] names;
		Node next;
	}

	//Zero argument constructor
	public Queue()
	{
		front = null;
		rear = null;
		currentSize = 0;
	}

	public boolean isEmpty()
	{
		return (currentSize == 0);
	}


	//Add data to the end of the list.
	public void enqueue(Object[] data)
	{
		Node oldRear = rear;
		rear = new Node();
		rear.names = data;
		rear.next = null;
		if (isEmpty()) {
			front = rear;
		}
		else {
			oldRear.next = rear;
		}
		currentSize++;

	}
}
