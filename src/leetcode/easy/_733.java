package leetcode.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _733 {
    public static void main(String[] args) {
        int[][] i1 = new int[][] {{1,1,1}, {1,1,0}, {1,0,1}},
                i2 = new int[][] {{0,0,0}, {0,0,0}};
        int sr1 = 1, sr2 = 1;
        int sc1 = 1, sc2 = 0;
        int c1 = 2, c2 = 2;
//        System.err.println(Arrays.toString(floodFill(i1, sr1, sc1, c1)));
        System.err.println(Arrays.toString(floodFill(i2, sr2, sc2, c2)));
    }

    static int[][] dr = new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;

        Queue<Integer> list = new LinkedList<>();
        list.add(sr);
        list.add(sc);
        int myColor = image[sr][sc];
        image[sr][sc] = color;

        while(!list.isEmpty()) {
            var x = list.poll();
            var y = list.poll();
            for (int i = 0; i < dr.length; i++) {
                int dx = dr[i][0] + x;
                int dy = dr[i][1] + y;

                if(dx < 0 || dy < 0 || dx >= image.length || dy >= image[0].length) continue; // 범위 벗어남
                if(image[dx][dy] != myColor) continue;  //색깔이 같지 않다면

                image[dx][dy] = color;
                list.add(dx);
                list.add(dy);
            }
        }

        return image;
    }
}
