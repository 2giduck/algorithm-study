package baekjoon.gold.t4;

import java.util.Arrays;
import java.util.Scanner;

public class _1253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var N = sc.nextInt();
        var A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int target = A[i];
            int start = 0, end = N-1;
            while(start < end) {
                if(start == i){
                    start++; continue;
                }else if(end == i) {
                    end --; continue;
                }
                var sum = A[start] + A[end];

                if(sum == target) {
                    count++;
                    break;
                }else if(sum > target) {
                    end--;
                }else {
                    start++;
                }
            }
        }

        System.out.println(count);
    }
}
