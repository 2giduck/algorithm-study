package programmers.level2;

import java.util.*;

public class _택배상자 {
    public static void main(String[] args) {
        int[] o1 = {4, 3, 1, 2, 5};
        int[] o2 = {5, 4, 3, 2, 1};
//        System.err.println(solution(o1));
        System.err.println(solution(o2));
    }

    public static int solution(int[] order) {
        Stack<Integer> bozo = new Stack<>();
        HashSet<Integer> set = new HashSet<>();

        int size = order.length;
        Queue<Integer> con = new LinkedList<>();
        for(int i = 1; i<=size; i++) {
            con.offer(i);
        }

        int answer = 0;
        for(int i = 0; i<order.length; i++) {
            var tmp = order[i];

            // 컨테이너 벨트에서 바로 실을 수 있는 경우
            if(!con.isEmpty()&& con.peek() == tmp) {
                con.poll();
                answer++;
            }else if(set.contains(tmp)){
                // 컨테이너 벨트에 없고 보조 컨테이너에 있는 경우
                if(bozo.peek() == tmp) {
                    // 바로 꺼낼 수 있는 경우
                    bozo.pop();
                    answer++;
                }else {
                    // 바로 못 꺼내는 경우
                    break;
                }
            }else {
                // 컨테이너 벨트에 없고 보조 컨테이너에도 없는 경우
                while(con.peek() != tmp) {
                    bozo.add(con.peek());
                    set.add(con.poll());
                }
                con.poll();
                answer++;
            }
        }

        return answer;
    }
}
