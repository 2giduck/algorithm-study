package programmers.etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class _행운의_편지 {
    public static void main(String[] args) {
        int n1 = 8, n2 = 8;
        int c1 = 3, c2 = 3;
        int k1 = 2, k2 = 2;
        int[][] contact1 = new int[][] {{1,4}, {2, 4}, {3, 4}, {2,6}, {4, 6}, {4,5}, {6,5}, {6, 7}, {5,7}, {7,8}},
                contact2 = new int[][] {{1,4}, {2,4}, {3,4}, {4,6}, {4,5}, {6, 5}, {6,7}, {5,7}, {7, 8}};
        System.err.println(solution(n1, c1, k1, contact1));
        System.err.println(solution(n2, c2, k2, contact2));
    }

    public static int solution(int n, int c, int k, int[][] contact) {
        var map = new HashMap<Integer, ArrayList<Integer>>();
        for(int[] cont : contact) {
            var list  = map.getOrDefault(cont[0], new ArrayList<>());
            list.add(cont[1]);
            map.put(cont[0], list);
        }

        var queue = new LinkedList<Integer>();
        for (int i = 1; i <= c ; i++) {
            queue.add(i);
        }

        var answer = n - c;
        var letterCount = new int[n+1];
        while(!queue.isEmpty()) {
            var start = queue.poll();

            if(!map.containsKey(start)) continue;
            for(int person : map.get(start)) {
                if(letterCount[person] == -1 ) continue; // 이미 행운의 편지를 다 보낸 사람일 경우

                letterCount[person] += 1;
                if(letterCount[person] == 1) answer-=1;

                if(letterCount[person] == k) {  // 최소 횟수를 다 채웠다면
                    letterCount[person] = -1;
                    queue.add(person);
                }
            }
        }

        return answer;
    }
}
