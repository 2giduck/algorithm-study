package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class re_200 {
    public static void main(String[] args) {
        char[][] g1 = new char[][] {{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},package leetcode.medium;

public class _200 {
    static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static boolean[][] visit;
    static int islands;
    static int m;
    static int n;

    public int numIslands(char[][] grid) {
        islands = 0;

        m = grid.length;
        n = grid[0].length;

        visit = new boolean[m][n];

        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(visit[i][j]) continue;
                if(grid[i][j] != '1') continue;
                dfs(i, j, grid);
                islands++;
            }
        }

        return islands;
    }


    public void dfs(int x, int y, char[][] grid) {
        visit[x][y] = true;

        for(int[] d: dir) {
            int nextX = x + d[0];
            int nextY = y + d[1];
            if(nextX < 0 || nextY < 0 || nextX >= m || nextY >= n) continue;
            if(grid[nextX][nextY] != '1') continue;
            if(visit[nextX][nextY]) continue;
            visit[nextX][nextY] = true;
            dfs(nextX, nextY, grid);
        }
    }
}

                {'0','0','0','0','0'}},
                g2 = new char[][] {
                        {'1','1','0','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}};
        System.err.println(numIslands(g1));
        System.err.println(numIslands(g2));
    }

    public static int numIslands(char[][] grid) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        queue.add(0);

        boolean[][] visit = new boolean[grid.length][grid[0].length];
        int[][] dist = new int[][] {{0,1}, {0,-1}, {1, 0}, {-1, 0}};
        var answer = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {

                if(grid[i][j] == '0') continue;
                if(visit[i][j]) continue;
                answer++;
                visit[i][j] = true;

                while(!queue.isEmpty()) {
                    int x = queue.poll();
                    int y = queue.poll();
                    visit[x][y] = true;

                    for(int k = 0; k<dist.length; k++) {
                        int dx = x + dist[k][0];
                        int dy = y + dist[k][1];

                        if(dx < 0 || dy < 0 || dx >= dist.length || dy >= dist[0].length) continue;
                        if(visit[dx][dy]) continue;
                        if(grid[dx][dy] == '0') continue;

                        queue.add(dx);
                        queue.add(dy);
                    }
                }
            }
        }

        return answer;
    }
}
