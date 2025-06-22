package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class _다리를_지나는_트럭 {

    public static void main(String[] args) {
        System.err.println(solution(2, 10, new int[] {7,4,5,6}));
        System.err.println(solution(100, 100, new int[] {10}));
        System.err.println(solution(100, 100, new int[] {10,10,10,10,10,10,10,10,10,10}));

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;


        Queue<Integer> waiting = new LinkedList<>();
        for(int t : truck_weights) {
            waiting.add(t);
        }
        Queue<Integer> crossing = new LinkedList<>();
        Queue<Integer> crossTime = new LinkedList<>();

        int curWeight = 0;
        int curCount = 0;
        while(!waiting.isEmpty() || !crossing.isEmpty()) {
            answer++; // 1초 증가

            if(!crossing.isEmpty()) {
                var time = crossTime.peek();
                if(answer - time >= bridge_length) {
                    var cro =  crossing.poll();
                    crossTime.poll();
                    curWeight -= cro;
                    curCount--;
                }
            }

            if(!waiting.isEmpty()) {
                var next = waiting.peek();
                if(curWeight + next <= weight && curCount + 1 <= bridge_length) {
                    waiting.poll();
                    curWeight += next;
                    curCount++;
                    crossing.add(next);
                    crossTime.add(answer);
                }
            }
        }

        return answer;
    }
}
