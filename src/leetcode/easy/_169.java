package leetcode.easy;

import java.util.HashMap;

public class _169 {
    public static void main(String[] args) {
        int[] n1 = new int[] {3,2,3}, n2 = new int[] {2,2,1,1,1,2,2};
        System.err.println(majorityElement(n1));
        System.err.println(majorityElement(n2));
    }

    public static int majorityElement(int[] nums) {
        int majorityTime = nums.length / 2;

        var map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            var temp = map.getOrDefault(num, 0) + 1;
            if(temp > majorityTime) {
                return num;
            }
            map.put(num, temp);
        }

        return 0;
    }
}
