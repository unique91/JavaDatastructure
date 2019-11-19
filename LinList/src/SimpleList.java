
public class SimpleList implements ListOperation {

	public SimpleList() {}
	
	Node firstElementNode = new Node("Head");
	
	public void insertLastElement(Object data) {
		Node newNode = new Node(data);
		Node lastNode = null;
		lastNode.getLastElement();
		lastNode.setNextLement(newNode);
	}

	@Override
	public void insertLast(Object data) {
		Node newNode = new Node(data);
		Node lastNode = 
	}

	@Override
	public void insertFirst(Node node, Object data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean find(Object data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Node getFirstElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node getLastElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void outputList() {
		// TODO Auto-generated method stub
		
	}
}

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
