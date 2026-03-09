package bronze;

import java.util.Scanner;

public class boj_10988 {
    //팰린드롬인지 확인하기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        int output = 1;
        int start = 0;
        int end = input.length - 1;
        while (start < end) {
            if (input[start] != input[end]) {
                output = 0;
                break;
            } else {
                start++;
                end--;
            }
        }
        System.out.println(output);
    }
}
