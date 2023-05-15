package programmers.level2;

public class _땅따먹기 {
    int solution(int[][] land) {
        int answer = 0;

        int[][] dy = new int[land.length][4];
        dy[0][0] = land[0][0];
        dy[0][1] = land[0][1];
        dy[0][2] = land[0][2];
        dy[0][3] = land[0][3];

        for(int i = 1; i<land.length; i++) {
            dy[i][0] = Math.max(Math.max(dy[i-1][1], dy[i-1][2]), dy[i-1][3]) + land[i][0];
            dy[i][1] = Math.max(Math.max(dy[i-1][0], dy[i-1][2]), dy[i-1][3]) + land[i][1];
            dy[i][2] = Math.max(Math.max(dy[i-1][1], dy[i-1][0]), dy[i-1][3]) + land[i][2];
            dy[i][3] = Math.max(Math.max(dy[i-1][1], dy[i-1][2]), dy[i-1][0]) + land[i][3];
        }

        int idx = land.length -1;
        return Math.max(Math.max(Math.max(dy[idx][0], dy[idx][1]), dy[idx][2]), dy[idx][3]);
    }
}
