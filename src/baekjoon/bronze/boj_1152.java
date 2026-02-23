package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_1152 {
    //단어의 개수
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        ArrayList<String> words = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()){
            words.add(stringTokenizer.nextToken());
        }
        System.out.println(words.size());
    }
}
