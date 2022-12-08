package leetcode.easy;

public class _746 {
    public static void main(String[] args) {
        int[] c1 = new int[] {10, 15, 20},
                c2 = new int[] {1, 100, 1, 1, 1, 100, 1,1, 100, 1};
        System.err.println(minCostClimbingStairs(c1));
        System.err.println(minCostClimbingStairs(c2));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] dx = new int[cost.length + 1];

        dx[0] = cost[0];
        dx[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            dx[i] = Math.min(dx[i-1], dx[i-2]) + cost[i];
        }
        return Math.min(dx[cost.length-2], dx[cost.length-1]);
    }
}
