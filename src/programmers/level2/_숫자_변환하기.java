package programmers.level2;

public class _숫자_변환하기 {
    public static void main(String[] args) {
        int x1 = 10, x2 = 40, x3 = 5;
        int y1 = 10, y2 = 40, y3 = 30;
        int z1 = 2, z2 = 5, z3 = 4;
        System.err.println(solution(x1, x2, x3));
        System.err.println(solution(y1, y2, y3));
        System.err.println(solution(z1, z2, z3));
    }

    public static int solution(int x, int y, int n) {
        int[] dy = new int[y+1];
        dy[x] = 1;

        for (int i = x+1; i <= y ; i++) {
            int tmp = Integer.MAX_VALUE;
            if(i % 2 == 0 && dy[i/2] != 0) {
                tmp = Math.min(tmp, dy[i/2]);
            }
            if(i % 3 == 0 && dy[i/3] != 0) {
                tmp = Math.min(tmp, dy[i/3]);
            }
            if(i-n >= 0 && dy[i-n] != 0) {
                tmp = Math.min(tmp, dy[i-n]);
            }

            if(tmp != Integer.MAX_VALUE) dy[i] = tmp+1;
        }

        return dy[y] == 0 ? -1 : dy[y]-1;
    }
}
