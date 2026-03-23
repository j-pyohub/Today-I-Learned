package silver;

import java.util.Scanner;

public class boj_2839 {
    //설탕 배달
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        while (N > 0) {
            if (N % 5 == 0) {
                count += N/5;
                N=0;
                break;
            }
            count++;
            N-=3;
        }
        if (N < 0) {
            System.out.println("-1");
        } else {
            System.out.println(count);
        }
    }
}
