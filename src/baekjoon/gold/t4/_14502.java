package baekjoon.gold.t4;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _14502 {

    static int n, m;
    static int[][] map;
    static int max = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backtrack(0);
        System.out.println(max);
    }

    static void backtrack(int depth) {
        if(depth == 3) {
            int size = spreadAndSize();
            max = Math.max(max, size);
            return;
        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(map[i][j] != 0) continue;
                map[i][j] = 1;
                backtrack(depth+1);
                map[i][j] = 0;
            }
        }
    }

    static int spreadAndSize() {
        int[][] temp = copyMap();

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(temp[i][j] == 2) {
                    queue.add(i);
                    queue.add(j);
                }
            }
        }

        while(!queue.isEmpty()) {
            int x = queue.poll();
            int y = queue.poll();

            for(int i = 0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(temp[nx][ny] != 0) continue;
                temp[nx][ny] = 2;
                queue.add(nx);
                queue.add(ny);
            }
        }

        int size = 0;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(temp[i][j] == 0) size++;
            }
        }
        return size;
    }

    // ✅ 2차원 배열 깊은 복사
    static int[][] copyMap() {
        int[][] newMap = new int[n][m];
        for(int i = 0; i<n; i++) {
            newMap[i] = map[i].clone();
        }
        return newMap;
    }
}
