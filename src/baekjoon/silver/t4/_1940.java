package baekjoon.silver.t4;

import java.util.Arrays;
import java.util.Scanner;

public class _1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int start = 0, end = N-1, count = 0;
        while(start < end) {
            int sum = arr[start] + arr[end];
            if(sum == M) {
                count++;
                start++;
                end--;
            }else if(sum < M) {
                start++;
            }else {
                end--;
            }
        }

        System.out.println(count);
    }
}
