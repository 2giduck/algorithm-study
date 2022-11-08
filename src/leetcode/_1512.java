package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _1512 {
    public static void main(String[] args) {
        int[] n1 = new int[] {1,2,3,1,1,3},
                n2 = new int[] {1,1,1,1},
                n3 = new int[] {1,2,3};

        System.err.println(numIdenticalPairs(n1));
        System.err.println(numIdenticalPairs(n2));
        System.err.println(numIdenticalPairs(n3));
    }

    public static int numIdenticalPairs(int[] nums) {

        var map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            var value = map.getOrDefault(nums[i], new ArrayList<>());
            value.add(i);
            map.put(nums[i], value);
        }

        var result = 0;
        for (int key : map.keySet()) {
            int size = map.get(key).size();
            result += size * (size-1) /2;
        }

        return result;
    }
}
