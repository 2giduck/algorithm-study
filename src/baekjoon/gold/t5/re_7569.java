package baekjoon.gold.t5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class re_7569 {
    static int m, n, h;
    static int[][][] tomatoes;
    static boolean[][][] visited;

    static int[] dx = {1, -1, 0, 0, 0, 0};  // 동서
    static int[] dy = {0, 0, 1, -1, 0, 0};  // 남북
    static int[] dz = {0, 0, 0, 0, 1, -1};  // 위아래

    static class Point {
        int x, y, z, day;

        Point(int x, int y, int z, int day) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        Queue<Point> queue = new LinkedList<>();

        tomatoes = new int[h][n][m];
        visited = new boolean[h][n][m];

        for (int z = 0; z < h; z++) {
            for (int y = 0; y < n; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < m; x++) {
                    tomatoes[z][y][x] = Integer.parseInt(st.nextToken());

                    if(tomatoes[z][y][x] == 1) {
                        queue.add(new Point(x, y, z, 0));
                        visited[z][y][x] = true;
                    }

                }
            }
        }


    }

}
