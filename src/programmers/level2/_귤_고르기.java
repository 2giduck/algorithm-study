package programmers.level2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class _귤_고르기 {
    public static void main(String[] args) {
        int k1 = 6, k2 = 4, k3 = 2;
        int[] t1 = {1, 3, 2, 5, 4, 5, 2, 3},
                t2 = {1, 3, 2, 5, 4, 5, 2, 3},
                t3 = {1, 1, 1, 1, 2, 2, 2, 3};
        System.err.println(solution(k1, t1));
        System.err.println(solution(k2, t2));
        System.err.println(solution(k3, t3));
    }

    public static int solution(int k, int[] tangerine) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) +1);
        }

        PriorityQueue<Mandarin> queue = new PriorityQueue<>();
        for(int key : map.keySet()) {
            queue.offer(new Mandarin(key, map.get(key)));
        }

        int answer = 0;
        while(k > 0) {
            Mandarin m = queue.poll();
            k-= m.count;
            answer++;
        }

        return answer;
    }

    static class Mandarin implements Comparable<Mandarin> {
        int size;
        int count;

        public Mandarin(int s, int c) {
            size = s;
            count = c;
        }

        @Override
        public int compareTo(Mandarin o) {
            return o.count - this.count;
        }
    }
}
