package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class _57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        var left = newInterval[0];
        var right = newInterval[1];
        List<int[]> list = new ArrayList<>();
        for(int[] i : intervals) {
            if(i[1] < left) {
                list.add(i);
                continue;
            }
            if(i[0] <= left && i[1] >= left) {
                left = Math.min(left, i[0]);
                right = Math.max(right, i[1]);
                continue;
            }
            if(right <i[0]) {
                list.add(new int[]{left, right});
                left = i[0];
                right = i[1];
                continue;
            }
            if(i[0]<= right && right <= i[1]) {
                left = Math.min(left, i[0]);
                right = Math.max(right, i[1]);
                continue;
            }
        }
        list.add(new int[]{left, right});
        return list.toArray(new int[0][]);
    }
}
