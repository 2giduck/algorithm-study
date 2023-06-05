package baekjoon.gold.t4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1707 {
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static boolean isEven;
    static int[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while(t-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            list = new ArrayList[V + 1];
            for (int i = 1; i <= V; i++) {
                list[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list[u].add(v);
                list[v].add(u);
            }

            visited = new boolean[V+1];
            check = new int[V+1];

            isEven = true;
            for(int i = 1; i<= V; i++) {
                if(isEven) {
                    DFS(i);
                }else {
                    break;
                }
            }
            if(isEven) {
                sb.append("YES").append("\n");
            }else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void DFS(int node) {
        visited[node] = true;
        for(int i : list[node]) {
            if(visited[i]) {
                if(check[i] == check[node]) {
                    isEven = false;
                    break;
                }
            }else {
                check[i] = (check[node] + 1) %2;
                DFS(i);
            }
        }
    }
}
