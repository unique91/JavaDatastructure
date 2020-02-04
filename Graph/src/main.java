
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
	}

}
