package baekjoon.silver.t2;

import java.util.ArrayList;
import java.util.Scanner;

public class _11725 {
    static ArrayList<Integer>[] list;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        list = new ArrayList[N+1];
        for (int i = 1; i <= N ; i++) {
            list[i] = new ArrayList<>();
        }
        arr = new int[N+1];

        for (int i = 0; i < N-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        boolean[] v = new boolean[N+1];
        dfs(1, v);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N ; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int start, boolean[] visit) {
        visit[start] = true;

        for (int tmp : list[start]) {
            if(visit[tmp]) continue;
            arr[tmp] = start;
            dfs(tmp, visit);
        }
    }
}
