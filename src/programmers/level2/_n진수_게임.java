package programmers.level2;

import java.util.Locale;

public class _n진수_게임 {
    public static void main(String[] args) {
        System.err.println(solution(2, 4, 2, 1));
        System.err.println(solution(16, 16, 2, 1));
        System.err.println(solution(16, 16, 2, 2));
    }

    public static String solution(int n, int t, int m, int p) {
        String answer = "";

        int num = 0;
        int idx = 1;

        while(answer.length() < t) {
            var word = Integer.toString(num, n);
            for(char w : word.toCharArray()) {
                if(idx % m == p || (idx % m == 0 && p == m)) {
                    answer += w;
                }
                if(answer.length() == t) break;
                idx++;
            }
            num++;
        }

        return answer.toUpperCase();
    }
}
