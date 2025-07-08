package baekjoon.gold.t4;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class re_17144 {

    static int r, c, t;
    static int[][] map;
    static int[][] tempMap;
    static int airCleanerTop = -1;
    static int airCleanerBottom = -1;

    // 방향: 상하좌우
    static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        map = new int[r][c];
        for(int i = 0; i<r; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j< c; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == -1) {
                    if(airCleanerTop == -1) airCleanerTop = i;
                    else airCleanerBottom = i;
                }
            }
        }

        for(int i = 0; i< t; i++) {
            spreadDust();
            runAirCleaner();
        }

        System.out.println(getTotalDust());
    }

    static void spreadDust() {
        tempMap = new int[r][c];

        tempMap[airCleanerTop][0] = -1;
        tempMap[airCleanerBottom][0] = -1;

        for(int i = 0; i<r; i++) {
            for(int j = 0; j<c; j++) {
                if(map[i][j] <= 0) continue;

                int spreadDust = map[i][j] / 5;
                int count = 0;

                for(int[] d : dir) {
                    int x = i + d[0];
                    int y = j + d[1];

                    if(x < 0 || x >= r || y < 0 || y >= c) continue;
                    if(tempMap[x][y] == -1) continue;

                    count++;
                    tempMap[x][y] += spreadDust;
                }

                tempMap[i][j] -= spreadDust * count;
            }
        }

        map = tempMap;
    }

    static void runAirCleaner() {
        // 위쪽 (반시계) 오른쪽 -> 위 -> 왼쪽 -> 아래

        // 아래쪽 (시계) 오른쪽 -> 아래 -> 왼쪽 -> 위

    }

    static int getTotalDust() {
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j] > 0) sum += map[i][j];
            }
        }
        return sum;
    }
}
