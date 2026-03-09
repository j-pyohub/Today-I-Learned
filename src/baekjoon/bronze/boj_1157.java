package bronze;

import java.io.IOException;
import java.util.Scanner;

public class boj_1157 {
    //단어 공부
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toUpperCase().toCharArray();
        int[] count = new int[26];
        char result;
        for (int i = 0; i < input.length; i++) {
            count[input[i] - 'A']++;
        }

        int answerIndex = 0;
        int maxCount = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                answerIndex = i;
            }
        }
        result = (char)(answerIndex + 'A');

        for (int i = 0; i < count.length; i++) {
            if (i != answerIndex&& count[i] == maxCount) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
