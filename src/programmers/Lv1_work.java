public class Lv1_work {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for (int i = 0; i < schedules.length; i++) {
            int limit = addMinute(schedules[i]);
            boolean success = true;

            for (int j = 0; j < 7; j++) {
                int day = (startday + j -1)%7;
                if (day>= 5) continue;
                if (limit < timelogs[i][j]) {
                    success = false;
                    break;
                }
            }
            if(success) answer++;
        }
        return answer;
    }

    private int addMinute(int time) {
        int hour = time / 100;
        int minute = time % 100;

        minute+= 10;

        if (minute >= 60) {
            hour+=1;
            minute-=60;
        }
        return hour*100+minute;
    }
}
