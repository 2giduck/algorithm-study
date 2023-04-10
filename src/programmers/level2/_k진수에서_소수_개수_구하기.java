package programmers.level2;

import java.util.Objects;

public class _k진수에서_소수_개수_구하기 {
    public static void main(String[] args) {
//        System.err.println(solution(437674, 3));
        System.err.println(solution(110011, 10));
    }

    public static int solution(int n, int k) {
        var tmp = Integer.toString(n, k).split("0");

        int answer = 0;
        for(String t : tmp) {
            if(Objects.equals(t, "")) continue;
            var v = Long.parseLong(t);

            if(isPrime(v)) answer++;
        }

        return answer;
    }

    public static boolean isPrime(long n) {
        if(n == 1) return false;
        if(n == 2) return true;
        if(n%2 == 0) return false;

        for (long i = 3; i <= Math.sqrt(n) +1 ; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
