package leetcode.medium;

import java.util.*;

public class _347 {
    class Number {
        int num;
        int frequent;
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Number> queue = new PriorityQueue<>((a, b) -> b.frequent - a.frequent);
        for(int key : map.keySet()) {
            Number number = new Number();
            number.num = key;
            number.frequent = map.get(key);
            queue.offer(number);
        }

        int[] answer = new int[k];
        for(int i = 0; i<k; i++) {
            answer[i] = queue.poll().num;
        }

        return answer;
    }
}
