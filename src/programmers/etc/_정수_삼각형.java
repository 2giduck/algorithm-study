package programmers.etc;

public class _정수_삼각형 {
    public static void main(String[] args) {
        int[][] triangle = new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.err.println(solution(triangle));
    }

    public static int solution(int[][] triangle) {
        int[][] dx = new int[triangle.length][triangle.length];
        dx[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(j <= 0 ) {
                    dx[i][j] = dx[i-1][j] + triangle[i][j];
                }else {
                    dx[i][j] = Math.max(dx[i-1][j-1] , dx[i-1][j]) + triangle[i][j];
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < triangle.length; i++) {
            answer = Math.max(dx[triangle.length-1][i], answer);
        }

        return answer;
    }
}
