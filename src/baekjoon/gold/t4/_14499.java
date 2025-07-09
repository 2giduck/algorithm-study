package baekjoon.gold.t4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14499 {

    static int[][] arr;
    static int[] prompt;
    static int[] dice = new int[7];

    // 방향: 동(1), 서(2), 북(3), 남(4)
    static final int[] dx = {0, 0, 0, -1, 1};
    static final int[] dy = {0, 1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sb = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(sb.nextToken());
        int m = Integer.parseInt(sb.nextToken());
        int x = Integer.parseInt(sb.nextToken());
        int y = Integer.parseInt(sb.nextToken());
        int k = Integer.parseInt(sb.nextToken());

        arr = new int[n][m];
        for(int i = 0; i<n; i++) {
            sb = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++) {
                arr[i][j] = Integer.parseInt(sb.nextToken());
            }
        }

        prompt = new int[k];
        sb = new StringTokenizer(br.readLine());
        for(int i = 0; i<k; i++) {
            prompt[i] = Integer.parseInt(sb.nextToken());
        }


        for(int p : prompt) {
            int nx = x + dx[p];
            int ny = y + dy[p];

            if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

            roll(p);

            if(arr[nx][ny] == 0) {
                arr[nx][ny] = dice[6];
            }else {
                dice[6] = arr[nx][ny];
                arr[nx][ny] = 0;
            }

            x = nx;
            y = ny;

            System.out.println(dice[1]);
        }
    }

    static void roll(int dir) {
        int[] temp = dice.clone();

        switch(dir) {
            case 1: // 동
                dice[1] = temp[4];
                dice[3] = temp[1];
                dice[6] = temp[3];
                dice[4] = temp[6];
                break;
            case 2: // 서
                dice[1] = temp[3];
                dice[4] = temp[1];
                dice[6] = temp[4];
                dice[3] = temp[6];
                break;
            case 3: // 북
                dice[1] = temp[5];
                dice[2] = temp[1];
                dice[6] = temp[2];
                dice[5] = temp[6];
                break;
            case 4: // 남
                dice[1] = temp[2];
                dice[5] = temp[1];
                dice[6] = temp[5];
                dice[2] = temp[6];
                break;
        }
    }
}
