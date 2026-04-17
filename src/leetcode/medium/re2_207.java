package leetcode.medium;

import java.util.*;

public class re2_207 {
    public static void main(String[] args) {
        int n1 = 2, n2 = 2;
        int[][] p1 = {{1,0}}, p2 = {{1,0}, {0,1}};
        int n3 = 3;
        int[][] p3 = {{1,0}, {1,2}, {0,1}};
        int n4 = 5;
        int[][] p4 = {{1,4}, {2,4}, {3,1}, {3,2}};
        System.err.println(canFinish(n1, p1));
        System.err.println(canFinish(n2, p2));
        System.err.println(canFinish(n3, p3));
        System.err.println(canFinish(n4, p4));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<numCourses; i++) {
            set.add(i);
        }

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int[] pre : prerequisites) {
            var list = map.getOrDefault(pre[1], new ArrayList<>());
            list.add(pre[0]);
            map.put(pre[1], list);
            set.remove(pre[0]);
        }

        if(set.isEmpty()) return false;

        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(set);

        while(!queue.isEmpty()) {
            var q = queue.poll();

            var list = map.getOrDefault(q, new ArrayList<>());
            queue.addAll(list);

            set.add(q);
        }


        return set.size() == numCourses;
    }
}
