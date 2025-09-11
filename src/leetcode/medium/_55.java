package leetcode.medium;

public class _55 {

    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];

        dp[0] = true;
        for(int i = 0; i<nums.length;i++) {
            if(!dp[i]) continue;

            int maxJump = nums[i];
            for(int j = 1; j<=maxJump; j++) {
                if(i+j >= nums.length) break;
                if(dp[i+j]) continue;
                dp[i+j] = true;
            }
        }

        return dp[nums.length-1];
    }
}
