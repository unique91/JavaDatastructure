
public class LGraph {
	static final int maxInt = Integer.MAX_VALUE;
	LKnode[] node;
	int nodeSize;
	LGraph(LKnode[] nodeL) {
		nodeSize = nodeL.length;
		node = new LKnode[nodeSize];
		for(int i = 0; i < nodeSize; i++) this.node[i] = nodeL[i];
	}
	
	// return direkt weight, if exists direct connection otherwise maxInt
	int nodeWeight(int u, int v) {
		if(u == v) return 0;
		VerbList vL = node[u].neighbours;
		while(vL != null) {
			if(vL.goal == v) return vL.wg;
			vL = vL.next;
		}
		return maxInt;
	}
	
	String getNodeDescription(int i) {
		return node[i].nodeDescription;
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
