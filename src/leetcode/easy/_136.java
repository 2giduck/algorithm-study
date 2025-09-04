package leetcode.easy;

import java.util.HashSet;

public class _136 {

    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(!set.contains(num)) {
                set.add(num);
            }else {
                set.remove(num);
            }
        }

        for(int num: set) {
            return num;
        }

        return -1;
    }
}
