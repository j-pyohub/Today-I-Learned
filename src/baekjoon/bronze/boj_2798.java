package bronze;

import java.util.Scanner;

public class boj_2798 {
    //블랙잭
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        int[] arrays = new int[n];
        for (int i = 0; i < n; i++) {
            arrays[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int i1 = arrays[i] + arrays[j] + arrays[k];
                    if (i1 > max && i1 <= m) {
                        max = i1;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
