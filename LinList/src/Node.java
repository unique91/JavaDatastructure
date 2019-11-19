
public class Node {
	private Object data;
	private Node next;
	
	Node(Object data) {
		this.data = data;
		next = null;
	}
	
	public void setNextElement(Node next) {
		this.next = next;
	}
	
	public Node getNextElement() {
		return this.next;
	}
	
	public Object getObject() {
		return this.data;
	}
}
