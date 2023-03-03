package baekjoon.silver.t1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _1931 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Meeting[] meets = new Meeting[N];

    for (int i = 0; i < N; i++) {
      long start = sc.nextInt();
      long end = sc.nextInt();
      meets[i] = new Meeting();
      meets[i].start = start;
      meets[i].end = end;
    }

    Arrays.sort(meets, new Comparator<Meeting>() {
      @Override
      public int compare(Meeting o1, Meeting o2) {
        if(o1.end  == o2.end) {
          return (int) (o1.start - o2.start);
        }else {
          return (int) (o1.end - o2.end);
        }
      }
    });

    int count = 0;
    long previousEnd = 0;
    for(Meeting meet : meets) {
      if(previousEnd <= meet.start) {
        count++;
        previousEnd = meet.end;
      }
    }


    System.out.println(count);
  }

  static class Meeting {
    long start;
    long end;
  }

}
