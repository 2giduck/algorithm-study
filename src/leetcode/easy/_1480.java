package leetcode.easy;

import java.util.Arrays;

public class _1480 {
    public static void main(String[] args) {
        int[] n1 = new int[] {1,2,3,4},
                n2 = new int[] {1,1,1,1,1},
                n3 = new int[] {3,1,2,10,1};
        System.err.println(Arrays.toString(runningSum(n1)));
        System.err.println(Arrays.toString(runningSum(n2)));
        System.err.println(Arrays.toString(runningSum(n3)));
    }

    public static int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];

        answer[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i-1] + nums[i];
        }

        return answer;
    }
}
