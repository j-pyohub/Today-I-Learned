package bronze;

import java.util.Scanner;

public class boj_2869 {
    //달팽이는 올라가고 싶다
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();
        int day = (V-B-1)/(A-B)+1;

        System.out.println(day);
    }
}
