package bronze;

import java.util.Scanner;

public class boj_2588 {
    //곱셈
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int answer1 = num1 * (num2 % 10);
        int answer2 = num1 * (num2 % 100 - num2 % 10)/10;
        int answer3 = num1 * (num2 - num2 % 100)/100;
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(num1*num2);
        }
}
