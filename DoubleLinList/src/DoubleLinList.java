public class DoubleLinList  implements List {
	class Node {
		Node next;
		Node prev;
		int value;
		
		Node(int value) {
			this.value = value;
		}
	}
	protected Node head;
	
	private Object value;
	private DoubleLinList next;
	
	// Add a node at the front of the list
	public void addFront(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		newNode.prev = null;
		
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}
	
	// Given a node as prev_node, insert a new node after the given node
	public void InsertAfter(Node prevNode, int value) {
		if(prevNode == null) {
			System.out.println("The node can't be null!");
			return;
		}
		
		Node newNode = new Node(value);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.prev = prevNode;
		
		if(newNode.next != null) {
			newNode.next.prev = newNode;
		}
	}
	
	public void printList(Node node) {
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while(node != null) {
			System.out.print(node.value + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.value + " ");
			last = last.prev;
		}
	}
	
	public DoubleLinList() {
		// TODO Auto-generated constructor stub
		value = null;
		next = null;
	}
	
	@Override
	public boolean isEmpty() {
		return next == null;
	}

	@Override
	public boolean isInList(Object x) {
		// TODO Auto-generated method stub
		return (find(x) != null);
	}

	@Override
	public Object firstElement() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return null;
		} else {
			return next.value;
		}
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return 0;
		} else {
			return 1 + next.length();
		}
	}

	@Override
	public List insert(Object x) {
		// TODO Auto-generated method stub
		DoubleLinList newObj = new DoubleLinList();
		newObj.value = x;
		newObj.next = next;
		next = newObj;
		return this;
	}

	@Override
	public List append(Object x) {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return insert(x);
		} else {
			return next.append(x);
		}
	}
	
	@Override
	public DoubleLinList find(Object x) {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return null;
		} else {
			if(firstElement().equals(x))
				return this;
			else 
				return next.find(x);
		}
	}

	@Override
	public List delete(Object x) {
		// TODO Auto-generated method stub
		DoubleLinList delObj = find(x);
		if(!isEmpty()) {
			delObj.next = delObj.next.next;
		}
		return this;
	}

	@Override
	public List delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return (next == null ? " |--" : " --> " + next.value + next);
	}
}
