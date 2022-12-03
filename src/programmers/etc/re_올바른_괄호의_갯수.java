package programmers.etc;

public class re_올바른_괄호의_갯수 {
    public static void main(String[] args) {

    }

    public static int solution(int n) {
        int[] dx = new int[14+1];
        dx[1] = 1;

        for(int i=2 ; i<=n ; i++) {
            dx[i] = dx[i-1]*3 -1;
        }

        return dx[n];
    }
}
