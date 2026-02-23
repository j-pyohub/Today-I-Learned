package silver;

import java.util.Scanner;

public class boj_1427 {
    //소트인사이드
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] number = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            number[i] = Integer.parseInt(input.substring(i, i + 1));
        }
        for (int i = 0; i < input.length(); i++) {
            int max = i;
            for (int j = i + 1; j < input.length(); j++) {
                if (number[j] > max) {
                    max = j;
                }
            }
            if (number[i] < number[max]) {
                int temp = number[i];
                number[i] = number[max];
                number[max] = temp;
            }
        }
        for (int i = 0; i < input.length(); i++) {
            System.out.print(number[i]);
        }
    }
}
