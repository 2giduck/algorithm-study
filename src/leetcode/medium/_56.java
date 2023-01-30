package leetcode.medium;

import java.util.*;

public class _56 {
    public static void main(String[] args) {
        int[][] i1 = new int[][] {{1,4}, {0,2}, {3, 5}};
        merge(i1);
    }

    public static int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] - o2[0]);
            }
        });
        // left, right 선언
        var left = intervals[0][0];
        var right = intervals[0][1];

        for(int i = 1; i<intervals.length; i++) {

            // 앞이 right보다 클 경우 list에 l,r add , swap l,r
            if(right < intervals[i][0]){
                list.add(new int[]{left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            }
            // 앞이 right보다 작거나 같을 경우 r, 뒤 더 큰 쪽을 r에 삽입
            else {
                left = Math.min(intervals[i][0], left);
                right = Math.max(intervals[i][1], right);
            }
        }

        list.add(new int[]{left, right});

        return list.toArray(new int[0][]);
    }
}
