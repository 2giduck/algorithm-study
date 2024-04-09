package leetcode.medium;

import java.util.Arrays;

public class _167 {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i<numbers.length; i++) {
            int a = numbers[i];
            var t = Arrays.binarySearch(numbers, i+1, numbers.length, target-a);
            if(t >= 0) {
                return new int[] {i+1, t+1};
            }
        }

        return new int[] {};
    }
}
