package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class _933 {

    class RecentCounter {

        private Queue<Integer> queue;

        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.add(t);
            int count = 0;
            Queue<Integer> newQueue = new LinkedList<>();
            while(!queue.isEmpty()) {
                int time = queue.poll();
                if(time >= t - 3000) {
                    newQueue.add(time);
                    count++;
                }
            }
            queue = newQueue;
            return count;
        }
    }
}
