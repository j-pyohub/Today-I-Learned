package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_25206 {
    //너의 평점은
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0;
        double totalGrade = 0;
        double gradeNumber = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String subject = stringTokenizer.nextToken();
            double score = Double.parseDouble(stringTokenizer.nextToken());
            String grade = stringTokenizer.nextToken();
            switch (grade) {
                case "A+":
                    gradeNumber = 4.5;
                    break;
                case "A0":
                    gradeNumber = 4.0;
                    break;
                case "B+":
                    gradeNumber = 3.5;
                    break;
                case "B0":
                    gradeNumber = 3.0;
                    break;
                case "C+":
                    gradeNumber = 2.5;
                    break;
                case "C0":
                    gradeNumber = 2.0;
                    break;
                case "D+":
                    gradeNumber = 1.5;
                    break;
                case "D0":
                    gradeNumber = 1.0;
                    break;
                case "F":
                    gradeNumber = 0;
                    break;
            }
            if (grade.equals("P")) continue;
            totalGrade += score*gradeNumber;
            totalScore += score;
        }
        System.out.printf("%.6f\n", totalGrade/totalScore);
    }
}
