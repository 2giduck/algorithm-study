package leetcode.medium;

public class _53 {
    public int maxSubArray(int[] nums) {
        // dp[i] = Math.max(dp[i-1] + num[i], num[i]);
        int size = nums.length;
        int[] dp = new int[size];

        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < size; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i] , nums[i]);
            max = Math.max(dp[i], max);
        }

        return max;
    }
}
