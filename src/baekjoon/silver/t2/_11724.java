package baekjoon.silver.t2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _11724 {

  static ArrayList<Integer>[] list;
  static boolean[] visit;
  static int result;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    list = new ArrayList[N+1];
    visit = new boolean[N+1];

    for (int i = 1; i <= N ; i++) {
      list[i] = new ArrayList<>();
    }

    for (int i = 0; i < M; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      list[u].add(v);
      list[v].add(u);
    }

    result = 0;
    for (int i = 1; i <= N ; i++) {
      if(!visit[i]){
        result++;
        dfs(i);
      }
    }

    System.out.println(result);
  }

  public static void dfs(int start) {
    visit[start] = true;

    for(int temp : list[start]) {
      if(visit[temp]) continue;

      dfs(temp);
    }
  }
}
