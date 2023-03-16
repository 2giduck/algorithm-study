package baekjoon.gold.t5;

import java.util.ArrayList;
import java.util.Scanner;

public class _1068 {
    static ArrayList<Integer>[] list;
    static int target;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        list = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            list[i] = new ArrayList<>();
        }

        int start = -1;
        boolean[] v = new boolean[N];
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if(a == -1) {
                start = i;
            }else {
                list[a].add(i);
            }
        }

        target = sc.nextInt();
        if(target == start) {
            System.out.println(0);
        }else {
            answer = 0;
            dfs(start, v);

            System.out.println(answer);
        }
    }

    public static void dfs(int start, boolean[] v) {
        v[start] = true;

        int count = 0;
        for (int tmp : list[start]) {
            if(v[tmp]) continue;
            if(tmp == target) continue;
            count++;
            dfs(tmp, v);
        }

        if(count == 0) answer++;
    }
}
