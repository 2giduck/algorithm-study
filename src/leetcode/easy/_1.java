package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _1 {
    public static void main(String[] args) {
        int[] n1 = new int[] {2, 7, 11, 15},
                n2 = new int[] {3,2,4},
                n3 = new int[] {3,3};
        int t1 = 9, t2 = 6, t3 = 6;
        System.err.println(Arrays.toString(twoSum(n1, t1)));
        System.err.println(Arrays.toString(twoSum(n2, t2)));
        System.err.println(Arrays.toString(twoSum(n3, t3)));
    }

    public static int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            var values = map.getOrDefault(nums[i], new ArrayList<>());
            values.add(i);
            map.put(nums[i], values);
        }

        var answer = new int[2];
        for(int num : map.keySet()) {
            int temp = target - num;

            if(map.containsKey(temp)) {
                if(temp == num) {
                    if(map.get(temp).size() < 2) continue;
                    else {
                        answer[0] = map.get(temp).get(0);
                        answer[1] = map.get(num).get(1);
                        break;
                    }
                }
                answer[0] = map.get(temp).get(0);
                answer[1] = map.get(num).get(0);
                break;
            }
        }

        return answer;
    }
}
