public class RandomMatrix{

private int vertices;
private int edges;
private static int[][] graph;

public RandomMatrix() {
 vertices = (int) (Math.random()*100);
 edges = (int) (Math.random()*100);
 graph = new int[vertices][edges];
 int[][]adjMatrix = buildAdjMatrix(vertices, edges, graph);
}
//
// public RandomMatrix(int[][] adjMatrixOfGraph){
//
// Maybe this constructor can be used to run Steven's program (the one
// that reads the graph and interpretes it.)
// then, we call the other method setAdjMatrix;
//
// }

public static int[][] buildAdjMatrix(int vertices, int edges, int[][] graph){
  int[][] adjMatrix = new int[vertices][vertices];
  int n = 0;
  while (n < edges){
    for (int i = 0; i < vertices; i++){
      for (int j = 0; j < vertices; j++){
        if (i != j && Math.random() <= 0.5){
          adjMatrix[i][j] = 1;
          n++;
        }
      }
    }
  }
  return adjMatrix;
}


public int[][] getAdjMatrix(int[][] adjMatrix){
  // The print of the Adjacency Matrix.
  return adjMatrix;
}

/*
public int[][] setAdjMatrix(whatever parameter to pass the graph){


}
Maybe this method can be used when making the adjacency matrix of
the uploaded graph (read and interpreted by Steven's code)
*/

}
