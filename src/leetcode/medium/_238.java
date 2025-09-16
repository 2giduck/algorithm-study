package leetcode.medium;

public class _238 {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];
        int left = 1;
        for(int i = 0; i < size; i++) {
            answer[i] = left;
            left *= nums[i];
        }
        int right = 1;
        for(int i = size-1; i>=0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
    }
}
