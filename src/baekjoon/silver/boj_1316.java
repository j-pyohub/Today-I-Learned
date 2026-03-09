package silver;

import java.util.Scanner;

public class boj_1316 {
    //그룹 단어 체커
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        int answer = 0;

        for (int i = 0; i <count; i++) {
            String word = scanner.nextLine();
            boolean[] visited = new boolean[26];
            boolean isGroupWord = true;

            visited[word.charAt(0)-'a']=true;

            for (int j = 1; j < word.length(); j++) {
                char prev = word.charAt(j - 1);
                char curr = word.charAt(j);

                if (prev != curr) {
                    if (visited[curr - 'a']) {
                        isGroupWord=false;
                        break;
                    }
                    visited[curr-'a']=true;
                }
            }
            if (isGroupWord) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
