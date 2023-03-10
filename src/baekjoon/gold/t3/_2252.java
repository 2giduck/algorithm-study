package baekjoon.gold.t3;

import java.util.ArrayList;
import java.util.Scanner;

public class _2252 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    ArrayList<Integer>[] list = new ArrayList[N+1];
    for (int i = 1; i <= N ; i++) {
      list[i] = new ArrayList<>();
    }

    int[] arr = new int[N+1];
    for (int i = 0; i < M ; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      list[a].add(b);
      arr[b]++;
    }

    int count = N;
    StringBuilder sb = new StringBuilder();
    while(count != 0) {

      for (int i = 1 ; i <= N ; i++) {
        if(arr[i] == 0) {
          for(int tmp : list[i]) {
            arr[tmp]--;
          }
          sb.append(i + " ");
          arr[i] = -1;
          count--;
        }
      }
    }

    System.out.println(sb);
  }

}
