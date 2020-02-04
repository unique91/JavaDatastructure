
public class LGraph {
	static final int maxInt = Integer.MAX_VALUE;
	LKnode[] node;
	int nodeSize;
	LGraph(LKnode[] nodeL) {
		nodeSize = nodeL.length;
		node = new LKnode[nodeSize];
		for(int i = 0; i < nodeSize; i++) this.node[i] = nodeL[i];
	}
	
	class VerbList {
		int goal;
		int wg;
		VerbList next;
		VerbList(int z, int w, VerbList v) {
			this.goal = z;
			this.wg = w;
			this.next = v;
		}
	}
	
	class LKnode {
		String nodeDescription;
		VerbList neighbours;
		LKnode(String s, VerbList v) {
			this.nodeDescription = s;
			this.neighbours = v;
		}
	}
}
