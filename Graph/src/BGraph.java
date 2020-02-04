// Define a Graph with Adjazenzmatrix
// Matrix with weights
public class BGraph {
	String[] nodeDescription;
	int[][] matrix;
	int nodeSize;
	
	BGraph(String[] nodeDescription, int[][] node) {
		this.nodeSize = nodeDescription.length;
		this.nodeDescription = new String[nodeSize];
		for(int i = 0; i < nodeSize; i++) {
			this.nodeDescription[i] = nodeDescription[i];
		}
		this.matrix = new int[nodeSize][nodeSize];
		for(int i = 0; i < nodeSize; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				this.matrix[i][j] = node[i][j];
			}
		}
	}
	
	String getNodeDescription(int i) {
		return nodeDescription[i];
	}
	
	int nodeWeight(int u, int v) {
		return matrix[u][v];
	}
}
