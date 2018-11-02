public class LowerBound{

	private int vertices;
	
	public LowerBound(int vertices){
		this.vertices = vertices;
	}
	
	public int lowerbound(int[] degree, int [][] adjacencyMatrix){
		int Vdegree=degree[0]; //lb=lowerbound
		int lbVertice=0;
		int lb = 0;
		for(int i=1 ;i<Vdegree; i++){
			if(degree[i]>Vdegree){
				lbVertice=i;
				Vdegree=degree[i];
			}
		}
		int[] adjacentvertices = new int[Vdegree];
		int place =0;
		for(int j=0; j<vertices; j++){
			if(adjacencyMatrix[lbVertice][j]==1){
			adjacentvertices[place]=j;
			place++;
			}
		}
		for(int p = 0; p<Vdegree;p++){
			int v = adjacentvertices[p];
			int value=0;
			for(int c = 0; c<Vdegree; c++){
				if(adjacencyMatrix[v][c]==1)
					value++;
			}
			if(value==Vdegree-1)
				lb++;
		}
		if(lb==0) lb++;
		return lb;
	}
}