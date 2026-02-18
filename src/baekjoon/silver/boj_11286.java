package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class boj_11286 {
    //절댓값 힙
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int firstAbs = Math.abs(o1);
            int secondAbs = Math.abs(o2);
            //절댓값이 같은 경우 음수 우선
            if (firstAbs == secondAbs) {
                return o1 > o2 ? 1 : -1;
            }
            //절댓값 작은 데이터 우선
            return firstAbs - secondAbs;
        });
        for (int i = 0; i < n; i++) {
            int request = Integer.parseInt(bufferedReader.readLine());
            if (request == 0) {
                if (priorityQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(priorityQueue.poll());
                }
            } else {
                priorityQueue.add(request);
            }
        }

    }
}
