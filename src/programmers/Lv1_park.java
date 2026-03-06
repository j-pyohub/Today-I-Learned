import java.util.Arrays;

public class Lv1_park {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        Arrays.sort(mats);

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                if (park[i][j].equals("-1")) {
                    int[] nowPos = {i, j};
                    for (int k = mats.length-1; k >=0; k--) {
                        if(mats[k]>answer){
                            if (matCheck(mats[k], nowPos, park)) {
                                answer = mats[k];
                                break;
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }

    private boolean matCheck(int matLength, int[] startPos, String[][] park) {
        if(startPos[0] + matLength > park.length) return false;
        for (int i = startPos[0]; i < startPos[0] + matLength; i++) {
            if(startPos[1]+matLength>park[0].length) return false;
            for (int j = startPos[1]; j < startPos[1] + matLength; j++) {
                if(!park[i][j].equals("-1")) return false;
            }
        }
        return true;
    }
}
