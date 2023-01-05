package leetcode.easy;

import java.util.HashMap;

public class _217 {
    public boolean containsDuplicate(int[] nums) {
        var map = new HashMap<Integer, Integer>();

        for(int num : nums) {
            var temp = map.getOrDefault(num, 0);
            if(temp != 0) return true;
            map.put(num, 1);
        }

        return false;
    }
}
