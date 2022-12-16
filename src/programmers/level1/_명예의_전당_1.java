package programmers.level1;

import java.util.*;

public class _명예의_전당_1 {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int idx = 0;
        int[] answer = new int[score.length];
        for(int s : score) {
            if(pq.size() == k) {
                var x = pq.poll();
                if(x < s) pq.add(s);
                else pq.add(x);
            } else {
                pq.add(s);
            }
            answer[idx++] = pq.peek();
        }

        return answer;
    }
}
