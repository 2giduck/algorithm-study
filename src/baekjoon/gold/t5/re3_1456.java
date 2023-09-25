package baekjoon.gold.t5;

import java.util.ArrayList;
import java.util.Scanner;

public class re3_1456 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();

  }

  static boolean isPrime(long num) {
    if(num == 1) return false;

    if(num == 2) return true;
    if(num %2 == 0) return false;

    for(int i = 3; i<=Math.sqrt(num) + 1; i+=2) {
      if(num % i == 0) return false;
    }
    return true;
  }
}
