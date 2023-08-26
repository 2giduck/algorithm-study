package baekjoon.gold.t5;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _1715 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    for (int i = 0; i < N; i++) {
      queue.add(sc.nextInt());
    }

    int answer = 0;
    while(queue.size() != 1) {
      int x = queue.poll();
      int y = queue.poll();
      answer += x + y;
      queue.add(x+y);
    }

    System.out.println(answer);
  }
}
