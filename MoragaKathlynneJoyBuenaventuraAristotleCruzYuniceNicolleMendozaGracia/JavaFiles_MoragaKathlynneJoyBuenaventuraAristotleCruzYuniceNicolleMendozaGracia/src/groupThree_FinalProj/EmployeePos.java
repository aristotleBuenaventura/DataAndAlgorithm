package groupThree_FinalProj;

class EmployeePos {

	//reference to head 
	//first node of the Singly Linked List 
	public Node head = null;

	//class Node that hold data and a reference/link 
	//to the next Node in the list
	class Node {
		private String name;
		private String positionName;
		private Node next;

		public Node(String name, String positionName) {
			this.name = name;
			this.positionName = positionName;
			this.next = null;
		}
	}

	/*
	* Method to add a node at the beginning of the list 
	*/
	public int prepend(String name, String positionName) {
		
	//create a new node 
		Node newNode = new Node(name, positionName);

	//check if the list is empty 
		if (this.head == null) {
			
			//make the new node as head
			this.head = newNode;
		} else {
			
			//Point the new node's next to head
			newNode.next = this.head;
			//make the new node as head	
			this.head = newNode;
		}
		
		return 0;
	}

	 /*
	 * Method to add a node at the end of the list
	 */
	public int append(String name, String positionName) {

		//Create a new node
		Node newNode = new Node(name, positionName);

		int index = 0;
		//check if the list is empty 
		if (this.head == null) {
			//Make the new node as head
			this.head = newNode;
		} else {
			Node current = this.head;
			
		//traverse to the end of the list
			while (current.next != null) {
				current = current.next;
				index++;
			}
			
			index++;
			current.next = newNode;
		}
		
		return index;
	}

	/*
	 * Method to add a node at the specified position in the list
	 */	

	public int add(int position, String name, String positionName) {
		//Create a new node
		Node newNode = new Node(name, positionName);
		// Initialize the cur and prev nodes to the head
		Node current = this.head, prev = this.head;

		if (position == 0) {
			// Point the new node's next to head
			newNode.next = head;
			// Make the new node as head
			this.head = newNode;
			return 0;
		}
		
		int index = 0;
	//traverse to the end of the list and check positions moved
		while (--position > 0) {
		
		//update the pre and current references
			prev = current;
			current = current.next;
			
			index++;
		}

		//update prev to point to new node
		prev.next = newNode;

		// & new node to point to current node
		newNode.next = current;
		
		return index;
	}

}