import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
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

        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "->" + adj.get(i));
        }
    }
}
