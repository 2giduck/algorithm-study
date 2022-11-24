package programmers.etc;

import java.util.LinkedList;

public class re_기지국_설치 {

    public static void main(String[] args) {
        int n1 = 11, n2 = 16;
        int[] s1 = new int[] {4, 11},
                s2 = new int[] {9};
        int w1 = 1, w2 = 2;

        System.err.println(solution(n1, s1, w1));
        System.err.println(solution(n2, s2, w2));
    }


    public static int solution(int n, int[] stations, int w) {
        int count = 0;

        boolean[] presents = new boolean[n + 1];
        for (int i = 0; i < stations.length; i++) {
            presents[stations[i]] = true;
        }

        var list = new LinkedList<Integer>();
        list.add(1 + w);
        while(!list.isEmpty()) {
            var idx = list.pop();

            if(!presents[idx]) count++;

            if(idx + w +1 <= n) {
                list.add(idx + w + 1);
            }
        }
        return count;
    }
}