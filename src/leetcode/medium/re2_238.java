package leetcode.medium;

import java.util.Arrays;

public class re2_238 {
    public static void main(String[] args) {
        int[] n1 = {1,2,3,4},
        n2 = {-1, 1, 0, -1, 3};

        System.err.println(Arrays.toString(productExceptSelf(n1)));
        System.err.println(Arrays.toString(productExceptSelf(n2)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        for(int i = 0, j = 1; i < nums.length; i++) {
            answer[i] = j;
            j = j * nums[i];
        }

        for(int i = nums.length-1, j = 1; i >= 0 ; i--) {
            answer[i] *= j;
            j = j * nums[i];
        }

        return answer;
    }
}
