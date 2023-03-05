package baekjoon.silver.t3;

import java.util.Scanner;

public class _1929 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();

    StringBuilder sb = new StringBuilder();
    for (int i = M; i <=N ; i++) {
      if(isPrime(i)) sb.append(i).append("\n");
    }

    System.out.println(sb);
  }

  public static boolean isPrime(int num) {
    if(num == 1) return false;
    if(num == 2) return true;
    if(num%2 == 0) return false;

    for (int i = 3; i <= Math.sqrt(num) ; i=i+2) {
      if(num % i == 0) return false;
    }

    return true;
  }
}
