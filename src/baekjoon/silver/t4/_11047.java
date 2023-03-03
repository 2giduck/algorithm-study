package baekjoon.silver.t4;

import java.util.Scanner;

public class _11047 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    int count = 0;
    for (int i = N-1; i >= 0 ; i--) {
      count += K/A[i];
      K = K%A[i];
      if(K == 0) break;
    }

    System.out.println(count);
  }

}
