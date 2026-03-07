import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    static class Edge{
        int dest, weight;
        public Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    private boolean directed;
    private Map<Integer, List<Edge>> adjList;

    public Graph(boolean directed) {
        this.directed = directed;
        adjList = new HashMap<>();
    }

    public void addEdge(int src, int dest, int weight) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.get(src).add(new Edge(dest, weight));

        if (!directed) {
            adjList.putIfAbsent(dest, new ArrayList<>());
            adjList.get(dest).add(new Edge(src, weight));
        }
    }

    public void printGraph() {
        for (int node : adjList.keySet()) {
            System.out.print(node + " -> ");
            for (Edge edge : adjList.get(node)) {
                System.out.print("(" + edge.dest + ", " + edge.weight + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Undirected, unweighted");
        Graph g1 = new Graph(false);
        g1.addEdge(0, 1, 1);
        g1.addEdge(0, 2, 1);
        g1.printGraph();

        System.out.println("\nDirected, weighted");
        Graph g2 = new Graph(true);
        g2.addEdge(0, 1, 4);
        g2.addEdge(1, 2, 5);
        g2.printGraph();
    }
}
