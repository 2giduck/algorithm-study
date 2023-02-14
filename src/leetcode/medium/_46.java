package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _46 {
    public static void main(String[] args) {
        int[] n1 = {1,2,3},
                n2 = {0, 1},
                n3 = {1};
        System.err.println(permute(n1));
        System.err.println(permute(n2));
        System.err.println(permute(n3));
    }

    public static void backtrack(int[] nums, ArrayList<Integer> list, int remain, ArrayList<List<Integer>> answer,boolean[] check) {
        if(remain == 0) {
            answer.add((List<Integer>) list.clone());
        }else {
            for (int i = 0; i < nums.length; i++) {
                if(!check[i]) {
                    list.add(nums[i]); check[i] = true;
                    backtrack(nums, list, remain - 1, answer, check);
                    list.remove(list.size() - 1); check[i] = false;
                }
            }
        }

    }

    public static List<List<Integer>> permute(int[] nums) {
        int size = nums.length;
        var answer = new ArrayList<List<Integer>>();
        boolean[] check = new boolean[size];

        backtrack(nums, new ArrayList<>(), size, answer, check);

        return answer;
    }
}
