package leetcode.medium;

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
