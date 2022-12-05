package leetcode.easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class _1046 {
    public static void main(String[] args) {
        int[] s1 = new int[] {2,7,4,1,8,1},
                s2 = new int[] {1};
        System.err.println(lastStoneWeight(s1));
        System.err.println(lastStoneWeight(s2));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones) {
            queue.add(stone);
        }

        while(queue.size() > 1) {
            var a = queue.poll();
            var b = queue.poll();

            if(a == b) continue;

            queue.add(Math.abs(a - b));
        }

        return queue.isEmpty() ? 0 : queue.poll();
    }
}
