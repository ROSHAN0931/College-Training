public class adjMatrix {
    int vertices;
    int matrix[][];
    adjMatrix(int v){
        vertices = v;
        matrix = new int[v][v];
    }
    public void addEdge(int src, int dest){
        matrix[src][dest] = 1;
        matrix[dest][src] = 1;
    }
    public void printGraph(){
        for (int i=0;i<vertices;i++){
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        adjMatrix g = new adjMatrix(5);
        // 0 1 2 3 4
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.printGraph();
    }
}
