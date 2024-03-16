public class DLL {
	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
		} 
	}

	// 1) Add a node at the front:
	public void push(int new_data) {
		Node newNode = new Node(new_data);

		newNode.next = head;
		newNode.prev = null;

		if(head != null) {
			head.prev = newNode;
		}

		head = newNode;
	}

	// 2) Add a node after a given node:

}

// Applications of Doubly Linked List:

// (1) Doubly linked list can be used in navigation systems where both forward and backward traversal is required.
// (2) It can be used to implement different tree data structures.
// (3) It can be used to implement undo/redo operations. 

// Real-Time Applications of Doubly Linked List:

// (1) Doubly linked lists are used in web page navigation in both forward and backward directions.
// (2) It can be used in games like a deck of cards. 

// Advantages of Doubly Linked List:

// (1) The doubly linked list allows traversing in both forward and backward directions.
// (2) Deletion of the nodes can be done easily.
// (3) Reversing of linked list is easy.
// (4) Insertion can be performed efficiently at any node. 

// Disadvantages of Doubly Linked List:

// (1) In a doubly-linked list, each node has an extra pointer which requires extra space.
// (2) Doubly linked list operations require more pointers to be handled hence, more time.
// (3) Random access to elements is not allowed.  