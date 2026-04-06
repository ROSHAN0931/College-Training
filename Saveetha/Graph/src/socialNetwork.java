import java.util.Scanner;

class socialNetwork{
    int vertices;
    int matrix[][];
    socialNetwork(int v){
        vertices = v;
        matrix = new int[v][v];
    }
    public void addEdge(int src,int dest){
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
        Scanner in = new Scanner(System.in);
        int ver = in.nextInt();
        socialNetwork g = new socialNetwork(ver);
        int ed = in.nextInt();
        for (int i=0;i<ed;i++){
            int src = in.nextInt(); // 1 = 0
            int dest = in.nextInt(); // 2 = 1
            g.addEdge(src-1,dest-1);
        }
        g.printGraph();
    }
}