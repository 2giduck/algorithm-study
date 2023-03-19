package programmers.level2;

public class _멀리_뛰기 {
    public static void main(String[] args) {
        int n1 = 4, n2 = 3;
        System.err.println(solution(n1));
        System.err.println(solution(n2));
    }

    public static long solution(int n) {
        long[] dy = new long[n+1];
        dy[1] = 1;
        if(n == 1) return dy[1];
        dy[2] = 2;

        for (int i = 3; i <= n ; i++) {
            dy[i] = (dy[i-1] + dy[i-2]) % 1234567;
        }

        return dy[n];
    }
}
