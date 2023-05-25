package baekjoon.silver.t1;

import java.util.*;

public class _1325 {
    static ArrayList<Integer> [] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        list = new ArrayList[N+1];
        for (int i = 1; i <= N ; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
        }

        int[] answer = new int[N+1];
        for(int i = 1 ; i <= N ; i++) {
            Queue<Integer> q = new LinkedList<>();
            q.add(i);

            boolean[] visit = new boolean[N+1];
            while(!q.isEmpty()) {
                var tmp = q.poll();
                visit[tmp] = true;
                for(int v : list[tmp]) {
                    if(visit[v]) continue;
                    q.add(v);
                    visit[v] = true;
                    answer[v]+=1;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        int max = -1;
        for(int i = 1 ; i<=N; i++) {
            if(max == answer[i]) {
                list.add(i);
            }else if(max < answer[i]) {
                max = answer[i];
                list.clear();
                list.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int a: list) {
            sb.append(a+ " ");
        }
        System.out.println(sb);
    }
}
