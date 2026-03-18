package silver;

import java.util.Scanner;

public class boj_1193 {
    //분수찾기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = 1;

        while (start * (start + 1) < 2*n) {
            start++;
        }

        int top = 0;
        int down = 0;
        int turn = n - start*(start-1)/2;

        if (start % 2 == 1) {
            for (int i = 0; i < turn; i++) {
                top = start - i;
                down = i+1;
            }
        }else {
            for (int i = 0; i < turn; i++) {
                top = i+1;
                down = start-i;
            }
        }
        System.out.println(top+"/"+down);
    }
}
