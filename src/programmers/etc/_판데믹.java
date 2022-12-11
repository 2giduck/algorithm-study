package programmers.etc;

import java.util.Queue;
import java.util.LinkedList;

public class _판데믹 {
    public static void main(String[] args) {
        int r = 3, c = 4, m = 2;
        int[][] q = new int[][] {{3,2}, {3,2}, {2,2}, {3,2}, {1,4},{3,2}, {2,3}, {3,1}};
        System.err.println(solution(r, c, m, q));
    }

    public static int[][] solution(int rows, int columns, int max_virus, int[][] queries) {
        int[][] virus = new int[rows][columns];

        int[][] dir = new int[][] {{0,1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean[][] exist;

        for(int[] q : queries){
            exist = new boolean[rows][columns];
            int x = q[0] -1;
            int y = q[1] -1;

            if(x < 0 || y < 0 || x >= rows || y >= columns) continue;

            int v = virus[x][y];
            if(v != max_virus) {
                virus[x][y]++;
            }else {
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(x);
                queue.offer(y);
                exist[x][y] = true;

                while(!queue.isEmpty()) {
                    int tx = queue.poll();
                    int ty = queue.poll();

                    for(int[] d : dir) {
                        int dx = tx + d[0];
                        int dy = ty + d[1];
                        if(dx < 0 || dy < 0 || dx >= rows || dy >= columns) continue;
                        if(exist[dx][dy]) continue;
                        if(virus[dx][dy] == max_virus) {
                            queue.offer(dx);
                            queue.offer(dy);
                        }else {
                            virus[dx][dy]++;
                        }
                        exist[dx][dy] = true;
                    }
                }
            }
        }

        return virus;
    }
}
