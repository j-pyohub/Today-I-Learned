package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1940 {
    //주몽
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        int[] numbers = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(numbers);
        int count = 0;
        int front = 0;
        int back = N-1;

        while(front < back){
            if (numbers[front] + numbers[back] < M){
                front++;
            } else if (numbers[front] + numbers[back] > M) {
                back--;
            } else {
                count++;
                front++;
                back--;
            }
        }
        System.out.println(count);
    }
}
