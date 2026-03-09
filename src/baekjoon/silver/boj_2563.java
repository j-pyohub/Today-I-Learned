package silver;

import java.util.Scanner;

public class boj_2563 {
    //색종이
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();

        boolean[][] filled = new boolean[100][100];
        int count = 0;

        for (int i = 0; i < number; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(filled[x+j][y+k]) continue;
                    filled[x+j][y+k] = true;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
