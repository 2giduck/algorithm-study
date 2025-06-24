package programmers.level2;

import java.util.*;

public class _프로세스 {

    public static void main(String[] args) {
        System.err.println(solution(new int[]{2,1,3,2}, 2));
        System.err.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(i);
        }

        int idx = 0;
        int count = 0;
        Integer[] sortedPriorities = new Integer[priorities.length];
        for(int i = 0; i < sortedPriorities.length; i++) {
            sortedPriorities[i] = priorities[i];
        }

        Arrays.sort(sortedPriorities, Collections.reverseOrder());
        while(!queue.isEmpty()) {
            int curPriority = sortedPriorities[idx];
            var cur = queue.poll();
            if(curPriority != priorities[cur]) {
                queue.add(cur);
            }else {
                count++;
                if(cur == location) {
                    answer = count;
                    break;
                }
                idx++;
            }
        }

        return answer;
    }
}
