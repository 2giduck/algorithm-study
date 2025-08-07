package leetcode.easy;

import java.util.*;

public class _283 {
    public void moveZeroes(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 0) {
                queue.add(i);
            }else if(!queue.isEmpty()) {
                int zeroIdx = queue.poll();
                nums[zeroIdx] = nums[i];
                nums[i] = 0;
                queue.add(i);
            }
        }
    }
}
