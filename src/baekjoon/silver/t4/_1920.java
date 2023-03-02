package baekjoon.silver.t4;

import java.util.Arrays;
import java.util.Scanner;

public class _1920 {
    static StringBuilder sb;
    static int N;
    static int[] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        sb = new StringBuilder();
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int find = sc.nextInt();
            binarySearch(find);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void binarySearch(int find) {
        int l = 0, r = N-1;
        while(l <= r) {
            int mid = (l+r)/2;

            if(A[mid] == find) {
                sb.append(1);
                return;
            }else if(A[mid] > find) {
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        sb.append(0);
    }
}
