package baekjoon.gold.t5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _9205 {

    static int n; // 편의점 수
    static Point[] locations; // 집 + 편의점들 + 페스티벌
    static boolean[] visited;

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int distance(Point o) {
            return Math.abs(o.x - this.x) + Math.abs(o.y - this.y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            n = Integer.parseInt(br.readLine()); // 편의점 수
            locations = new Point[n + 2]; // [0]: 집, [1~n]: 편의점, [n+1]: 페스티벌
            visited = new boolean[n + 2];

            for (int i = 0; i < n + 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                locations[i] = new Point(x, y);
            }

            // BFS로 탐색
            if (bfs()) {
                System.out.println("happy");
            } else {
                System.out.println("sad");
            }
        }
    }

    static boolean bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while(!queue.isEmpty()) {
            int idx = queue.poll();
            var curPoint = locations[idx];

            for(int i = 0; i<locations.length; i++) {
                if(visited[i]) continue;

                var dist = curPoint.distance(locations[i]);
                if(dist <= 1000) {
                    queue.add(i);
                    visited[i] = true;

                    if(i == locations.length - 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
