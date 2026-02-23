package bronze;

import java.util.Scanner;

public class boj_1110 {
    //더하기 사이클
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int original = input;
        int count = 0;

        do {
            int front = input / 10;
            int back = input % 10;
            int sum = front + back;

            input = back * 10 + sum % 10;
            count++;
        } while (input != original);

        System.out.println(count);
    }
}
