package programmers.level2;
import java.util.*;

public class _두_큐_합_같게_만들기 {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum = 0;
        long sum1 = 0, sum2 = 0;
        for(int q : queue1) {
            q1.add(q);
            sum+=q;
            sum1+=q;
        }
        for(int q : queue2) {
            q2.add(q);
            sum+=q;
            sum2+=q;
        }

        if(sum%2 != 0) return -1;
        long mid = sum/2;
        int max = queue1.length *3;
        int answer = 0;

        while(max-- > 0) {
            if(sum1 == mid) {
                return answer;
            }

            if(sum1 > mid) {
                var tmp = q1.poll();
                q2.offer(tmp);
                sum1 -= tmp;
                sum2 += tmp;
            }else {
                var tmp = q2.poll();
                q1.offer(tmp);
                sum2 -= tmp;
                sum1 += tmp;
            }
            answer++;
        }

        return -1;
    }

}
