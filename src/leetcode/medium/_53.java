package leetcode.medium;

public class _53 {

    public int maxSubArray(int[] nums) {
        // dp[i] : i까지의 subarry중 합이 가장 큰 sum
        // dp[i] = Max(dp[i-1] + nums[i], nums[i])
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i<nums.length; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i] , nums[i]);
            max = Math.max(dp[i], max);
        }

        return max;
    }
}
