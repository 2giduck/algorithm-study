package leetcode.easy;

import java.util.*;

public class _2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> num1Set = new HashSet<>();
        Set<Integer> num2Set = new HashSet<>();
        for(int num: nums1) {
            num1Set.add(num);
        }
        for(int num: nums2) {
            num2Set.add(num);
        }

        List<Integer> num1List = new ArrayList<>();
        List<Integer> num2List = new ArrayList<>();
        for(int num: num1Set) {
            if(num2Set.contains(num)) continue;
            num1List.add(num);
        }
        for(int num: num2Set) {
            if(num1Set.contains(num)) continue;
            num2List.add(num);
        }

        return List.of(num1List, num2List);
    }
}
