package baekjoon.silver.t2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _18352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer>[] list = new ArrayList[n+1];
        for (int i = 1; i <= n ; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
        }

        int[] dist = new int[n+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        dist[x] = 1;

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int next : list[temp]) {
                if(dist[next] != 0) continue;

                dist[next] = dist[temp] +1;
                queue.add(next);
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean check = true;
        for (int i = 1; i <= n ; i++) {
            if(dist[i]-1 == k) {
                check = false;
                sb.append(i).append("\n");
            }
        }

        if(check) System.out.println(-1);
        else System.out.println(sb);
    }
}
