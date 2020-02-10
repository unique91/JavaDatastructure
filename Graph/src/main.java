
public class main {

	public static void main(String[] args) {
		String[] nodeDescpription = {"Aachen","Köln", "Leverkusen", "Dortmund", "Frankfurt", "Darmstadt", "Mannheim"};
		int[][] matrix = {{0,80,Integer.MAX_VALUE,160,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
							{80,0,35,Integer.MAX_VALUE,165,Integer.MAX_VALUE, Integer.MAX_VALUE},
							{Integer.MAX_VALUE, 20, 0, 90, 165, Integer.MAX_VALUE, Integer.MAX_VALUE},
							{160, Integer.MAX_VALUE, 90, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
							{Integer.MAX_VALUE, 165, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 33, 75},
							{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 33, 0, 50},
							{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 75, 50, 0}};
		BGraph graph = new BGraph(nodeDescpription, matrix);
		System.out.println(graph.getNodeDescription(5) + " has weight " + graph.nodeWeight(4, 5));
		
		/*
		LGraph.LKnode[] node = { new LGraph.LKnode("Aachen", new LGraph.VerbList(1, 80, new LGraph.VerbList(3, 160, null))),
			new LGraph.LKnode("Köln", new LGraph.VerbList(0, 80, new LGraph.VerbList(2, 35, new LGraph.VerbList(4, 165, null))))};
		LGraph graph2 = new LGraph(node);
		System.out.println(graph2.getNodeDescription(1));
		*/
		
		LLGraph network = new LLGraph("DB-Network");
		LLNode n = network.putNodeInList("Darmstadt");
		LLNode n2 = network.putNodeInList("Frankfurt");
		LLNode n3 = network.putNodeInList("Mannheim");
		LLNode n4 = network.putNodeInList("Karlsruhe");
		n.putNeighborNode(n2, 30);
		n2.putNeighborNode(n3, 70);
		n3.putNeighborNode(n4, 45);
	}

}
