package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class _57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int start = newInterval[0];
        int end = newInterval[1];

        List<int []> list = new ArrayList<>();
        int index = 0;

        if (intervals.length == 0) {
            return new int[][] {{newInterval[0], newInterval[1]}};
        }

        while(index < intervals.length) {

            while (index < intervals.length && intervals[index][1] < start) {
                list.add(intervals[index]);
                index++;
            }

            int a = start;
            int b = end;
            while( index < intervals.length && intervals[index][0] <= b ) {
                a = Math.min(intervals[index][0], a);
                b = Math.max(intervals[index][1], b);
                index++;
            }
            list.add(new int[] {a, b});

            while(index < intervals.length) {
                list.add(intervals[index]);
                index++;
            }
        }

        return list.toArray(new int[0][]);
    }
}
