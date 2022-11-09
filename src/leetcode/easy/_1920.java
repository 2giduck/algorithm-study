package leetcode.easy;

import java.util.Arrays;

public class _1920 {
    public static void main(String[] args) {
        int[] n1 = new int[] {0,2,1,5,3,4},
                n2 = new int[] {5,0,1,2,3,4};

        System.err.println(Arrays.toString(buildArray(n1)));
        System.err.println(Arrays.toString(buildArray(n2)));
    }

    public static int[] buildArray(int[] nums) {

        var answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[nums[i]];
        }

        return answer;
    }
}
