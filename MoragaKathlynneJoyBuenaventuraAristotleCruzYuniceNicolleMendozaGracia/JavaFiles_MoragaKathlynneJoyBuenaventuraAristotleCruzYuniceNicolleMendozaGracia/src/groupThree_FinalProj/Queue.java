package groupThree_FinalProj;

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
