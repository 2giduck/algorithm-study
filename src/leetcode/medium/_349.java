package leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;

public class _349 {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        Arrays.sort(nums2);
        for(int num : nums1) {
            int i2 = Arrays.binarySearch(nums2, num);
            if(i2 >= 0) {
                set.add(num);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
