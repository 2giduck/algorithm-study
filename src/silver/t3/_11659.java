package baekjoon.silver.t3;

import java.util.Scanner;

public class _11659 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] nArr = new int[N+1];
    for (int i = 1; i <= N; i++) {
      nArr[i] = sc.nextInt();
    }

    // 합 배열 구하기
    int[] dy = new int[N+1];
    dy[1] = nArr[1];
    for (int i = 2; i <= N; i++) {
      dy[i] = dy[i-1] + nArr[i];
    }

    int[] ansArr = new int[M];
    // 합 배열로 구간 합 구하기
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      ansArr[i] = getSum(dy, a, b);
    }

    for(int ans : ansArr) {
      System.out.println(ans);
    }


  }

  public static int getSum(int[] dy, int a, int b) {
    return dy[b] - dy[a-1];
  }
}
