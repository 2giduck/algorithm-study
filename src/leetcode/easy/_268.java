package leetcode.easy;

import java.util.*;

public class _268 {

    public int missingNumber(int[] nums) {
        int length = nums.length;

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<=length; i++) {
            set.add(i);
        }

        for(int num: nums) {
            set.remove(num);
        }


        for(int num : set) {
            return num;
        }

        return 0;
    }
}
