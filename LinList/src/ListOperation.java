
public interface ListOperation {
	public void insertLast(Object data);
	public void insertFirst(Node node, Object data);
	public void deleteElement();
	public boolean find(Object data);
	public Node getFirstElement();
	public Node getLastElement();
	public void outputList();
}
