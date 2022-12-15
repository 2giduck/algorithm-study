package programmers.level1;

import java.util.*;

public class _과일_장수 {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int answer = 0;
        int count = 0;
        int lastSum = 0;
        for(int i = score.length -1 ; i >= 0 ; i--) {
            count++;
            if(count == m) {
                answer += m * score[i];
                lastSum = m*score[i];
                count = 0;
            }
        }


        return answer;
    }
}
