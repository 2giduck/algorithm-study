package baekjoon.silver.t5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2751 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

    Collections.sort(list);

    for(int i = 0; i<N; i++) {
      System.out.println(list.get(i));
    }

  }
}
