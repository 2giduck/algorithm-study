package baekjoon.gold.t4;

import java.util.Scanner;

public class _1976 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[N+1];
        for (int i = 1; i <= N ; i++) {
            arr[i] = i;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N ; j++) {
                int tmp = sc.nextInt();
                if(tmp == 1) {
                    union(i, j);
                }
            }
        }

        int f = -1;
        boolean check = false;
        for (int i = 1; i <= M ; i++) {
            int tmp = sc.nextInt();
            if(f == -1) {
                f = find(tmp);
            }
            else if(f != find(tmp)) {
                check = true;
                break;
            }
        }

        if(check) System.out.println("NO");
        else System.out.println("YES");
    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a != b) {
            arr[b] = a;
        }
    }

    public static int find(int a) {
        if(arr[a] != a) {
            arr[a] = find(arr[a]);
        }

        return arr[a];
    }
}
