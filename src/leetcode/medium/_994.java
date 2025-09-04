package leetcode.medium;

import java.util.*;

public class _994 {
    public int orangesRotting(int[][] grid) {
        Queue<Integer> queue = new LinkedList<>();
        int freshSize = 0;
        for(int i = 0; i<grid.length; i++) {
            for(int j = 0; j<grid[0].length; j++) {
                if(grid[i][j] == 2) {
                    queue.add(i);
                    queue.add(j);
                }else if(grid[i][j] == 1) {
                    freshSize++;
                }
            }
        }

        if(freshSize == 0) return 0;

        int minute = 0;
        int[][] dist = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while(!queue.isEmpty()) {
            int size = queue.size()/2;
            for(int i = 0; i < size; i++) {
                int x = queue.poll();
                int y = queue.poll();

                for(int[] d : dist) {
                    int dx = x + d[0];
                    int dy = y + d[1];

                    if(dx < 0 || dy < 0 || dx >= grid.length || dy >= grid[0].length) continue;
                    if(grid[dx][dy] != 1) continue;

                    grid[dx][dy] = 2;
                    queue.add(dx);
                    queue.add(dy);
                    freshSize--;
                }
            }
            minute++;
        }

        if(freshSize == 0) {
            return minute -1;
        }

        return -1;
    }
}
