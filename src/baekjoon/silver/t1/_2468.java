package baekjoon.silver.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2468 {

    static int[][] arr;
    static boolean[][] visit;
    static int n;

    static int[] x = new int[]{1, -1, 0, 0};
    static int[] y = new int[]{0, 0, 1, -1};
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        int max = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, arr[i][j]);
            }
        }

        count = 0;
        for(int i = 0; i<=max; i++) {
            int curCount = 0;
            visit = new boolean[n][n];
            for(int j = 0; j<n; j++) {
                for(int k = 0; k<n; k++) {
                    if(visit[j][k] || arr[j][k] <= i) continue;
                    bfs(j, k, i);
                    curCount++;
                }
            }
            count = Math.max(curCount, count);
        }

        System.out.println(count);
    }

    public static void bfs(int a, int b, int limit) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(a);
        queue.add(b);
        visit[a][b] = true;

        while(!queue.isEmpty()) {
            int curX = queue.poll();
            int curY = queue.poll();

            for (int d = 0; d < 4; d++) {
                int nextX = curX + x[d];
                int nextY = curY + y[d];
                if(nextX < 0 || nextY < 0 || nextX >= arr.length || nextY >= arr[0].length) continue;
                if(visit[nextX][nextY]) continue;
                if(arr[nextX][nextY] <= limit) continue;
                queue.add(nextX);
                queue.add(nextY);
                visit[nextX][nextY] = true;

            }
        }
    }
}
