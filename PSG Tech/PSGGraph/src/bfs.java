import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public static void graphbfs(int node,int vertices){
        boolean visited[] = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();

        visited[node] = true;
        q.offer(node);// 0

        while (!q.isEmpty()){
            int val = q.poll();//0
            System.out.print(val + " ");// 0

            for (int nearby : adj.get(val)){
                if (!visited[nearby]){
                    visited[nearby] = true;
                    q.offer(nearby);// 1
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        graphbfs(0,vertices);
    }
}
