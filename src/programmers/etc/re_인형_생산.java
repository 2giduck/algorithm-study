package programmers.etc;

import java.util.ArrayList;
import java.util.Collections;

public class re_인형_생산 {
    public static void main(String[] args) {
        int g = 43;
        int[] d = new int[] {5,3,7,6,4};

        System.err.println(solution(g, d));
    }

    public static long solution(int goal, int[] durations) {
        long answer = 0;

        int l = 1, r = 45;
        while(l <= r) {
            int mid = (l + r)/2;

            if(checkGoal(goal, durations, mid)) {
                answer = getIncentive();
                r = mid -1;
            }else {
                l = mid + 1;
            }
        }

        return answer;
    }

    private static ArrayList<Integer> list = new ArrayList<>();

    public static int getIncentive() {
        int min = Collections.min(list);

        int count = 0;
        for(int a : list) {
            count += a - min;
        }

        return count * 10000;
    }

    public static boolean checkGoal(int goal, int[] durations, int time) {
        list = new ArrayList<>();
        int sum = 0;
        for(int duration : durations) {
            var doll = (int)(((double)1/(double)duration) * (double)time);
            sum += doll;
            list.add(doll);
        }

        return sum >= goal;
    }
}
