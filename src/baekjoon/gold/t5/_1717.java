package baekjoon.gold.t5;

import java.util.Scanner;

public class _1717 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n+2];
        for (int i = 0; i <= n+1 ; i++) {
            arr[i] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int tmp = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(tmp == 0) {
                union(a, b);
            }else {
                if(find(a) != find(b)) {
                    sb.append("NO").append("\n");
                }else{
                    sb.append("YES").append("\n");
                }
            }
        }

        System.out.println(sb);
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
