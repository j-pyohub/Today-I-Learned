package silver;

import java.util.*;

public class boj_1260 {
    //DFS와 BFS
    static boolean visited[];
    static ArrayList<Integer> A[];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int V = scanner.nextInt();
        A = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            int S = scanner.nextInt();
            int E = scanner.nextInt();
            A[S].add(E);
            A[E].add(S);
        }
        //오름차순 정렬
        for (int i = 1; i < N+1; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[N + 1];
        goDFS(V);
        System.out.println();
        visited = new boolean[N + 1];
        goBFS(V);
        System.out.println();

    }

    private static void goBFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            System.out.print(nowNode+" ");
            for (int i : A[nowNode]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    private static void goDFS(int node) {
        System.out.print(node+" ");
        visited[node] = true;
        for (int i : A[node]) {
            if (!visited[i]) {
                goDFS(i);
            }
        }
    }
}
