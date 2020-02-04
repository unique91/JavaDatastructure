// Define a Graph with Adjazenzmatrix
// Matrix with weights
public class BGraph {
	String[] noodDescription;
	int[][] matrix;
	int nodeSize;
	
	BGraph(String[] nodeDescription, int[][] node) {
		
	}
	
	String getNodeDescription(int i) {
		return noodDescription[i];
	}
	
	int nodeWeight(int u, int v) {
		return matrix[u][v];
	}
}
