import com.sun.xml.internal.bind.marshaller.NoEscapeHandler;

public class SimpleList{
	class Node {
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

	
	
	
	/*Node node = new Node(null);
	
	public void insertLast(Object data) {
		Node newNode = new Node(data);
		Node lastNode = node.getNextElement();
		lastNode.setNextElement(newNode);
	}
	
	public void insertElement(Object data) {
		
	}*/
	
}
