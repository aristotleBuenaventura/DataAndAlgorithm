package groupThree_FinalProject;

class EmployeePos {

	public Node head = null;

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

	public int prepend(String name, String positionName) {
		
		Node newNode = new Node(name, positionName);

		if (this.head == null) {
			
			this.head = newNode;
		} else {
			
			newNode.next = this.head;

			this.head = newNode;
		}
		
		return 0;
	}

	
	public int append(String name, String positionName) {

		
		Node newNode = new Node(name, positionName);

		int index = 0;
		if (this.head == null) {
			
			this.head = newNode;
		} else {
			Node current = this.head;
			
			while (current.next != null) {
				current = current.next;
				index++;
			}
			
			index++;
			current.next = newNode;
		}
		
		return index;
	}

	
	public int add(int position, String name, String positionName) {
		
		Node newNode = new Node(name, positionName);
		Node current = this.head, prev = this.head;

		if (position == 0) {
			// Point the new node's next to head
			newNode.next = head;
			// Make the new node as head
			this.head = newNode;
			return 0;
		}
		
		int index = 0;
		while (--position > 0) {
			prev = current;
			current = current.next;
			
			index++;
		}

		prev.next = newNode;

		newNode.next = current;
		
		return index;
	}


	public String display() {
		String value = "";
		if (this.head == null) {
			
			System.out.println("The List is empty.");
			
		} else {
			
			Node current = this.head;
			while (current != null) {
				value += current.name + "-" + current.positionName + ", ";
				current = current.next;	
				System.out.println("Current " + value);
			}
			
		}
		return value;
	}

}