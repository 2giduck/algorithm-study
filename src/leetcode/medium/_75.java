package leetcode.medium;

import java.util.Arrays;

public class _75 {
    public static void main(String[] args) {
        int[] n1 = {2, 0, 2, 1, 1, 0},
                n2 = {2, 0, 1};
        sortColors(n1);
        sortColors(n2);
    }
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
