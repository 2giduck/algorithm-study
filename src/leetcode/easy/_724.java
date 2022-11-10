package leetcode.easy;

import java.util.Arrays;

public class _724 {
    public static void main(String[] args) {
        int[] n1 = new int[] {1,7,3,6,5,6},
                n2 = new int[] {1,2,3},
                n3 = new int[] {2,1,-1},
                n4 = new int[] {-1,-1,-1,-1,-1,0};
//        System.err.println(pivotIndex(n1));
//        System.err.println(pivotIndex(n2));
//        System.err.println(pivotIndex(n3));
        System.err.println(pivotIndex(n4));
    }

    public static int pivotIndex(int[] nums) {
        int arraySum = Arrays.stream(nums).sum();

        int idx = 0;
        int pivot = -1;
        int previous = 0;
        while(idx < nums.length) {
            int num = nums[idx];

            if(previous == arraySum - (num+previous)) {
                pivot = idx;
                break;
            }
            previous += num;
            idx++;
        }

        return pivot;
    }
}
