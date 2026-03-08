import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Prim {
    static int N = 4;
    static List<int[]>[] graph = new ArrayList[N];

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        int[][] edges = {
                {0, 1, 1}, {0, 2, 4}, {1, 2, 2}, {1, 3, 6}, {2, 3, 3}
        };

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[2], e[1]});
            graph[e[1]].add(new int[]{e[2], e[0]});
        }

        boolean[] visited = new boolean[N];
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(
                Comparator.comparingInt(a -> a[0])
        );
        priorityQueue.offer(new int[]{0, 0});
        int mstWeight = 0;

        while (!priorityQueue.isEmpty()) {
            int[] curr = priorityQueue.poll();
            int w = curr[0], u = curr[1];
            if (visited[u]) {
                continue;
            }
            visited[u] = true;
            mstWeight += w;
            for (int[] next : graph[u]) {
                if (!visited[next[1]]) {
                    priorityQueue.offer(next);
                }
            }
        }
        System.out.println("MST Weight: " + mstWeight);
    }
}
