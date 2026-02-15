package silver;

import java.util.Scanner;

public class boj_2018 {
    //수들의 합5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = 1;
        int end = 1;
        int count = 1;
        int sum = 1;

        while (end != n){
            if (sum < n){
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start++;
            } else {
                count++;
                end++;
                sum += end;
            }
        }
        System.out.println(count);
    }
}
