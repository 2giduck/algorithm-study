package programmers.etc;

import java.time.LocalTime;
import java.util.Arrays;
import static java.time.temporal.ChronoUnit.MINUTES;

public class _상담예약제 {
    public static void main(String[] args) {
        String[][] b1 = new String[][] {{"09:10", "lee"}},
                b2 = new String[][] {{"09:55", "hae"}, {"10:05", "jee"} };
        String[][] u1 = new String[][] {{"09:00", "kim"}, {"09:05", "bae"}},
                u2 = new String[][] {{"10:04", "hee"}, {"14:07", "eom"}};
        System.err.println(Arrays.toString(solution(b1, u1)));
        System.err.println(Arrays.toString(solution(b2, u2)));
    }

    public static String[] solution(String[][] booked, String[][] unbooked) {

        int bCount = 0, uCount = 0;
        String[] answer = new String[booked.length + unbooked.length];
        int aCount = 0;
        while(bCount < booked.length && uCount < unbooked.length) {
            var timeB = LocalTime.parse(booked[bCount][0]);
            var timeU = LocalTime.parse(unbooked[uCount][0]);

            if(timeB.isBefore(timeU)) { // 예약 고객이 비예약 고객보다 빠른 경우
                answer[aCount++] = booked[bCount++][1];
            }else{
                if(MINUTES.between(timeU, timeB) < 10) {
                    answer[aCount++] = booked[bCount++][1];
                }else {
                    answer[aCount++] = unbooked[uCount++][1];
                }
            }
        }

        if(bCount == booked.length) {
            for (int i = uCount; i < unbooked.length; i++) {
                answer[aCount++] =unbooked[uCount++][1];
            }
        }else{
            for (int i = bCount; i < booked.length; i++) {
                answer[aCount++] =booked[bCount++][1];
            }
        }

        return answer;
    }
}
