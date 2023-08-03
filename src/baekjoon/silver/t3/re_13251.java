package baekjoon.silver.t3;

import java.util.Scanner;

public class re_13251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        int n = 0;
        for(int i = 0; i<m; i++) {
            arr[i] = sc.nextInt();
            n+=arr[i];
        }
        int k = sc.nextInt();
    }
}
