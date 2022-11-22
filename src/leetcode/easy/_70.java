package leetcode.easy;

public class _70 {
    public static void main(String[] args) {
        int n1 = 2, n2 = 3;
        System.err.println(climbStairs(n1));
        System.err.println(climbStairs(n2));
    }

    public static int climbStairs(int n) {
        int[] nArr = new int[n + 1];

        nArr[1] = 1;
        if(n < 2) return nArr[1];
        nArr[2] = 2;

        for (int i = 3; i <= n ; i++) {
            nArr[i] = nArr[i-1] + nArr[i-2];
        }

        return nArr[n];
    }
}

