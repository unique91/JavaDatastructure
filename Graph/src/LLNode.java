
public class LLNode {
	String nodeDescription;
	NbList neighbor;
	LLNode next;
	LLNode(String s, LLNode next) {
		this.nodeDescription = s;
		this.neighbor = null;
		this.next = next;
	}
	
	public void putNeighborNode(LLNode goal, int weight) {
		neighbor = new NbList(goal, weight, neighbor);
	}
}

class NbList {
	LLNode node;
	int weight;
	NbList next;
	NbList(LLNode node, int weight, NbList next) {
		this.node = node;
		this.weight = weight;
		this.next = next;
	}
}
