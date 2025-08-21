package leetcode.medium;

import java.util.Arrays;

public class _2300 {

    class Solution {
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            int size = spells.length;
            int[] answer = new int[size];

            Arrays.sort(potions);
            for(int i = 0; i< size; i++) {
                int idx = binarySearch(potions, spells[i], success);
                answer[i] = potions.length - idx;
            }

            return answer;
        }

        public int binarySearch(int[] potions, int spell, long success) {
            int left = 0;
            int right = potions.length - 1;
            int idx = potions.length;

            while(left <= right) {
                int mid = left + (right - left)/2;
                long strength = (long) potions[mid] * spell;

                if(strength >= success) {
                    idx = mid;
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }

            return idx;
        }
    }
}
