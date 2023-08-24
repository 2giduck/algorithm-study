package baekjoon.gold.t5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _13023 {

    static List<Integer>[] list;
    static boolean[] visit;
    static boolean check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        list = new ArrayList[n];
        for(int i = 0; i<n; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        visit = new boolean[n];
        check = false;
        for(int i = 0; i<m; i++) {
            DFS(i, 1);
            if(check) {
                break;
            }
        }

        if(check) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

    public static void DFS(int start, int depth) {
        if(depth == 5) {
            check = true;
            return;
        }

        visit[start] = true;
        for(int a : list[start]) {
            if(!visit[a]) {
                DFS(a, depth + 1);
            }
        }
        visit[start] = false;
    }
}
