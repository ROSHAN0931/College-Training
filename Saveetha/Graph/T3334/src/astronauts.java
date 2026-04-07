import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class astronauts {
    public static void dfs(int node,List<List<Integer>> graph,boolean visited[],int[] s){
        visited[node] = true;
        s[0]++;
        for (int x : graph.get(node)){
            if (!visited[x]) {
                dfs(x, graph, visited, s);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //number of vertcies
        int p = in.nextInt(); //number of pairs
        //build graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        //input for pairs
        for (int i = 0; i < p; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        boolean visited[] = new boolean[n];
        List<Integer> sizes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!visited[i]){
                int[] s = new int[1];
                dfs(i,graph,visited,s);
                sizes.add(s[0]);
            }
        }
        //counting
        long result  = 0;
        long sum = 0;
        for (int i : sizes){
            result = result + sum * i; // 6
            sum = sum + i; // 5
        }
        System.out.println(result);
    }
}