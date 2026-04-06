import java.util.LinkedList;
public class adjList {
    private int vertices;
    private LinkedList<Integer>[] adlist;
    adjList(int v){
        vertices = v; // 5
        adlist = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adlist[i] = new LinkedList<>();
        }
    }
    void addEdge(int src, int dest){
        adlist[src].add(dest);
        adlist[dest].add(src);
    }
    void printGraph(){
        for (int i=0;i<vertices;i++){
            System.out.print(i +"->");
            for (Integer x : adlist[i]){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        adjList g = new adjList(5);
        // 0 1 2 3 4
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.printGraph();
    }
}