// Define a Graph with Adjazenzmatrix
// Only Boolean values
public class AGraph {
	private String[] nodeDescription = {"a", "b", "c", "d", "e", "f", "g", "h"};
	private int nodeSize;
	//matrix[u][v] <=> (u,v) elem. E
	private boolean[][] matrix = {{false, true, false, true, true, false, false, false},
						  {false, false, true, false, true, false, false, false}};    
	
	AGraph(String[] nodeDescribe, boolean[][] node) {
		for(int i = 0; i < nodeSize; i++) {
			this.nodeDescription[i] = nodeDescribe[i];
		}
	}
}
