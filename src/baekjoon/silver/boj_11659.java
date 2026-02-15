package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj_11659 {
    //구간 합 구하기
    public static void main(String[] args) throws IOException {
        //입력데이터가 많으면 bufferedReader 추천
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int 만으로는 크기가 너무 클 때 StringTokenizer
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        long[] sums = new long[N+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= N; i++) {
            sums[i] = sums[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int front = Integer.parseInt(stringTokenizer.nextToken());
            int back = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(sums[back] - sums[front-1]);
        }
    }
}
