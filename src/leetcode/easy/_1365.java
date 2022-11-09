package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class _1365 {
    public static void main(String[] args) {
        int[] n1 = new int[]{8,1,2,2,3},
                n2 = new int[] {6, 5, 4, 8},
                n3 = new int[] {7, 7, 7, 7};

        System.err.println(Arrays.toString(smallerNumbersThanCurrent(n1)));
        System.err.println(Arrays.toString(smallerNumbersThanCurrent(n2)));
        System.err.println(Arrays.toString(smallerNumbersThanCurrent(n3)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortArr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortArr);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < sortArr.length; i++) {
            if(!map.containsKey(sortArr[i])) {
                map.put(sortArr[i], i);
            }
        }

        var result = new int[nums.length];
        int count = 0;
        for(int n : nums) {
            result[count++] = map.get(n);
        }

        return result;
    }
}
