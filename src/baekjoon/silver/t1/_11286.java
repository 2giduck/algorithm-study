package baekjoon.silver.t1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _11286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)) {
                    return o1- o2;
                }else {
                    if(Math.abs(o1) < Math.abs(o2)) {
                        return -1;
                    }else {
                        return 1;
                    }
                }
            }
        });

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x != 0) {
                q.add(x);
            }else {
                if(q.isEmpty()) {
                    sb.append("0\n");
                }else{
                    sb.append(q.poll() + "\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
