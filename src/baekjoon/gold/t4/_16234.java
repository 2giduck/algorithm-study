package baekjoon.gold.t4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _16234 {

    static int n, l, r;
    static int[][] countries;
    static boolean[][] visited;
    static int[] dirm = {-1, 1, 0, 0};
    static int[] dirc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        countries = new int[n][n];
        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++) {
                countries[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int days = 0;

        while(true) {
            boolean check = false;
            visited = new boolean[n][n];

            for(int i = 0; i<n; i++) {
                for(int j = 0; j<n; j++) {
                    if(visited[i][j]) continue;
                    if(bfs(i, j)) {
                        check = true;
                    }
                }
            }

            if(check == false) break;

            days++;
        }


        System.out.println(days);
    }

    static boolean bfs(int x, int y) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        queue.add(x);
        queue.add(y);
        queue2.add(x);
        queue2.add(y);
        visited[x][y] = true;
        int count = 1;
        int people = countries[x][y];

        while(!queue.isEmpty()) {
            int nx = queue.poll();
            int ny = queue.poll();

            for(int i = 0; i<4; i++) {
                int nx2 = nx + dirm[i];
                int ny2 = ny + dirc[i];

                if(nx2 < 0 || nx2 >= n || ny2 < 0 || ny2 >= n) continue;
                if(visited[nx2][ny2]) continue;

                int tmp = Math.abs(countries[nx2][ny2] - countries[nx][ny]);
                if(l <= tmp && tmp <= r) {
                    queue.add(nx2);
                    queue.add(ny2);
                    queue2.add(nx2);
                    queue2.add(ny2);
                    count++;
                    people += countries[nx2][ny2];
                    visited[nx2][ny2] = true;
                }
            }
        }

        int oneCountryPeople = people / count;
        while(!queue2.isEmpty()) {
            int nx = queue2.poll();
            int ny = queue2.poll();
            countries[nx][ny] = oneCountryPeople;
        }

        return count != 1;
    }
}
