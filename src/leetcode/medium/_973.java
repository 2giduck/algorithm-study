package leetcode.medium;

import java.util.PriorityQueue;

public class _973 {
    public static void main(String[] args) {
        int[][] p1 = {{1,3}, {-2,2}},
                p2 = {{3,3}, {5,-1}, {-2,4}};
        int k1 = 1, k2 = 2;
        kClosest(p1, k1);
        kClosest(p2, k2);
    }

    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[] > queue = new PriorityQueue<>((a, b) -> -1 * Integer.compare(
                b[0]*b[0] + b[1]*b[1],
                a[0]*a[0] + a[1]*a[1]
        ));

        for(int[] point: points) {
            queue.add(point);
        }

        int[][] answer = new int[k][2];

        for(int i = 0; i<k; i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }
}
