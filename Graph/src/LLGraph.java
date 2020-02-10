
public class LLGraph {
	String graphDescription;
	LLNode list;
	int nodeSize;
	LLGraph(String description) {
		this.graphDescription = description;
		this.list = null;
		nodeSize = 0;
	}
	
	public LLNode putNodeInList(String nodeDescription) {
		list = new LLNode(nodeDescription, list);
		nodeSize++;
		return list;
	}
}
