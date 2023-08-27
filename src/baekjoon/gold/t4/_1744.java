package baekjoon.gold.t4;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _1744 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    PriorityQueue<Integer> plusQ = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minusQ = new PriorityQueue<>();
    int zero = 0;
    int one = 0;

    for (int i = 0; i < N; i++) {
      int var = sc.nextInt();
      if (var == 0) {
        zero++;
      }else if(var == 1) {
        one++;
      } else if(var > 0) {
        plusQ.add(var);
      }else {
        minusQ.add(var);
      }
    }

    int answer = 0;
    while(plusQ.size() > 1) {
      answer += (plusQ.poll() * plusQ.poll());
    }
    if(!plusQ.isEmpty()) answer+= plusQ.poll();

    while(minusQ.size() > 1) {
      answer += (minusQ.poll() * minusQ.poll());
    }
    if(!minusQ.isEmpty() && zero == 0) {
      answer += minusQ.poll();
    }

    answer+= one;

    System.out.println(answer);
  }
}
