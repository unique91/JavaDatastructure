import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class SimpleList {
	
	public static class Node {
		private Object data;
		private Node next;
		
		Node(Object data) {
			this.data = data;
			this.next = null;
		}
		
		public void setNextLement(Node next) {
			this.next = next;
		}
		
		public Node getLastElement() {
			return this.next;
		}
		
		public Object getObject() {
			return this.data;
		}
	}
	
	public Node head;

	public SimpleList() { head = null;}
	
	public void insert(Object data) {
		Node newNode = new Node(data);
		// 1. Linked List empty
		if(head == null) {
			head = newNode;
		} else {
			// 2. Linked List not empty
			newNode.next = head;
			head = newNode;
		}
	}
	
	public String toString() {
		String str = "[";
		while(this.head != null && this.head.next != null) {
			str += this.head.data + ", ";
			this.head = this.head.next;
		}
		if(this.head != null) {
			str += this.head.data + "]";
		}
		return str;
	}
	
	public static void main(String[] args) {
		SimpleList list = new SimpleList();
		list.insert('J');
		list.insert('o');
		list.insert('h');
		System.out.println(list.toString());
	}
}
