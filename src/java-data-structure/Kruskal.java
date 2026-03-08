import java.util.Arrays;
import java.util.Comparator;

public class Kruskal {
    static int N = 4;
    static int[][] edges = {
            {0, 1, 1}, {0, 2, 4}, {1, 2, 2}, {1, 3, 6}, {2, 3, 3}
    };
    static int[] parent = new int[N];

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    static boolean union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);
        if (xRoot != yRoot) {
            parent[yRoot] = xRoot;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
        Arrays.sort(edges, Comparator.comparingInt(a -> a[2]));

        int mstWeight = 0;
        for (int[] edge : edges) {
            int u=edge[0],v=edge[1],w=edge[2];
            if (union(u, v)) {
                mstWeight += w;
            }
        }
        System.out.println("MST Weight: " + mstWeight);
    }
}
