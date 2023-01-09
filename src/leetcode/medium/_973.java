package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class _973 {
    public static void main(String[] args) {
        int[][] p1 = {{1,3}, {-2,2}},
                p2 = {{3,3}, {5,-1}, {-2,4}};
        int k1 = 1, k2 = 2;
        kClosest(p1, k1);
        kClosest(p2, k2);
    }

    public static int[][] kClosest(int[][] points, int k) {

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int[] o = {0, 0};

                return (int) ((Math.pow(o1[0] - o[0], 2) + Math.pow(o1[1] - o[1], 2))
                                        - (Math.pow(o2[0] - o[0], 2) + Math.pow(o2[1] - o[1], 2)));
            }
        });


        return Arrays.copyOfRange(points, 0, k);
    }
}
