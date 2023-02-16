package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class _78 {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3}, n2 = {0};
        System.err.println(subsets(n1));
        System.err.println(subsets(n2));
    }

    public static void backTrack(int[] nums, int start, int remain, List<List<Integer>> answer, List<Integer> curr) {
        if(remain == 0) {
            answer.add(new ArrayList<>(curr));
        }else {
            for (int i = start; i < nums.length; i++) {
                curr.add(nums[i]);
                backTrack(nums, i+1, remain - 1, answer, curr);
                curr.remove(curr.size()-1);
            }
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        var result = new ArrayList<List<Integer>>();

        for (int i = 0; i <= nums.length; i++) {
            backTrack(nums, 0, i, result, new ArrayList<>());
        }

        return result;
    }
}
