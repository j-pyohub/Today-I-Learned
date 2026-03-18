package bronze;

import java.util.Scanner;

public class boj_19532 {
    //수학은 비대면강의입니다
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int x = (c * e - b * f) / (a * e - b * d);
        int y = (a * f - d * c) / (a * e - d * b);

        System.out.println(x + " " + y);
    }
}
