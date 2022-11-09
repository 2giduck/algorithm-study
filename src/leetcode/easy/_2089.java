package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _2089 {

    public static void main(String[] args) {
        int[] n1 = new int[] {1, 2, 5, 2, 3},
                n2 = new int[] {1,2,5,2,3},
                n3 = new int[] {1,2,5,2,3};
        int t1 = 2, t2= 3, t3 = 5;

//        System.err.println(targetIndices(n1, t1));
//        System.err.println(targetIndices(n2, t2));
//        System.err.println(targetIndices(n3, t3));
        System.err.println(targetIndices(n3, 4));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        int l = 0, r = nums.length-1;
        int index = -1;
        while(l <= r) {
            int mid = (l + r)/2;

            if(nums[mid] < target) {
                l = mid + 1;
            }else if (nums[mid] > target) {
                r = mid - 1;
            }else {
                index = mid;
                break;
            }
        }

        if(index == -1) {
            return Collections.emptyList();
        }

        var answer = new ArrayList<Integer>();
        answer.add(index);

        int count = index-1;
        while(count >= 0) {
            if(nums[count] != target) break;
            answer.add(count--);
        }

        count = index + 1;
        while(count < nums.length) {
            if(nums[count] != target) break;
            answer.add(count++);
        }

        Collections.sort(answer);
        return answer;
    }
}
