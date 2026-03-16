package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class _542 {
    public int[][] updateMatrix(int[][] mat) { int[][] answer = new int[mat.length][mat[0].length]; Queue<int[]> queue = new LinkedList<>(); for (int i = 0; i < mat.length; i++) { for (int j = 0; j < mat[0].length; j++) { if (mat[i][j] == 0) { queue.add(new int[]{i, j}); } else { answer[i][j] = Integer.MAX_VALUE; } } } int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; while (!queue.isEmpty()) { int[] ad = queue.poll(); int a = ad[0]; int b = ad[1]; for (int[] d : dir) { int x = a + d[0]; int y = b + d[1]; if (x < 0 || x >= mat.length || y < 0 || y >= mat[0].length) continue; if (answer[x][y] > answer[a][b] + 1) { answer[x][y] = answer[a][b] + 1; queue.add(new int[]{x, y}); } } } return answer; }
}
