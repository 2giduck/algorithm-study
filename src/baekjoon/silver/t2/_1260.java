package baekjoon.silver.t2;

import java.util.*;

public class _1260 {
    static ArrayList<Integer>[] list;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        list = new ArrayList[N+1];
        for (int i = 1; i <= N ; i++) {
            list[i] = new ArrayList();
        }

        boolean[] visit = new boolean[N+1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 1; i <= N ; i++) {
            Collections.sort(list[i]);
        }

        sb = new StringBuilder();
        dfs(V, visit);
        sb.append("\n");
        visit = new boolean[N+1];
        bfs(V, visit);

        System.out.println(sb.toString());
    }

    public static void dfs(int start, boolean[] visit) {
        if(visit[start]) return;

        visit[start] = true;
        sb.append(start + " ");

        for(int temp : list[start]) {
            dfs(temp, visit);
        }
    }

    public static void bfs(int start, boolean[] visit) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visit[start] = true;

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            sb.append(temp + " ");
            for(int t : list[temp]) {
                if(visit[t]) continue;
                visit[t] = true;
                queue.offer(t);
            }
        }
    }
}
