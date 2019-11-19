
public class Node {
	Object data;
	Node next;
	
	Node(Object data) {
		this.data = data;
		next = null;
	}
	
	private Object getFirstElement() {
		return this.data;
	}
	
}
