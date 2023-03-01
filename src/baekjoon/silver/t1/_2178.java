package baekjoon.silver.t1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
        }

        int[][] dist = new int[N][M];
        bfs(0, 0, dist, str);
        System.out.println(dist[N-1][M-1]+1);
    }

    public static void bfs(int x, int y, int[][] dist, String[] str) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        queue.add(y);

        while(!queue.isEmpty()) {
            int a = queue.poll();
            int b = queue.poll();

            for(int[] t : new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}}) {
                int dx = a + t[0];
                int dy = b + t[1];

                if(dx<0 || dy < 0 || dx >= str.length || dy >= str[0].length()) continue;
                if(str[dx].charAt(dy) == '0') continue;
                if(dist[dx][dy] != 0) continue;

                dist[dx][dy] = dist[a][b] + 1;
                queue.add(dx);
                queue.add(dy);
            }
        }

    }
}
