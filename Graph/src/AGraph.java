// Define a Graph with Adjazenzmatrix
// Only Boolean values
public class AGraph {
	String[] nodeDescription = {"a", "b", "c", "d", "e", "f", "g", "h"};
	int nodeSize;
	//matrix[u][v] <=> (u,v) elem. E
	boolean[][] matrix = {{false, true, false, true, true, false, false, false},
						  {false, false, true, false, true, false, false, false}};    
	
	AGraph(String[] nodeDescribe, boolean[][] node) {
		
	}
}
