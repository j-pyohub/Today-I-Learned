public class Lv1_fold_bill {
    public int solution(int[] bill, int[] wallet) {
        int answer = 0;
        while (Math.max(bill[0], bill[1]) > Math.max(wallet[0], wallet[1]) || Math.min(bill[0], bill[1]) > Math.min(wallet[0],wallet[1])) {
            if (bill[0] > bill[1]) {
                bill[0] = bill[0]/2;
            }else {
                bill[1] = bill[1]/2;
            }
            answer++;
        }

        return answer;
    }
}
