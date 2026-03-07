import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstraArray {
    static int[] dijkstra(int[][][] graph, int start) {
        int n = graph.length;
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(
                Comparator.comparingInt(a -> a[0])
        );

        priorityQueue.offer(new int[]{0, start});

        while (!priorityQueue.isEmpty()) {
            int[] current = priorityQueue.poll();
            int d = current[0], u = current[1];
            if (d > distance[u]) {
                continue;
            }
            for (int[] edge : graph[u]) {
                int v = edge[0], w = edge[1];
                if (distance[u] + w < distance[v]) {
                    distance[v] = distance[u] + w;
                    priorityQueue.offer(new int[]{distance[v], v});
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int[][][] graph = new int[6][][];

        graph[0] = new int[][]{{1, 2}, {2, 5}};
        graph[1] = new int[][]{{0, 2}, {2, 4}, {3, 6}};
        graph[2] = new int[][]{{0, 5}, {1, 4}, {3, 2}, {4, 1}};
        graph[3] = new int[][]{{1, 6}, {2, 2}, {5, 3}};
        graph[4] = new int[][]{{2, 1}, {5, 1}};
        graph[5] = new int[][]{{3, 3}, {4, 1}};

        int[] distance = dijkstra(graph, 0);
        System.out.println(Arrays.toString(distance));
    }
}
