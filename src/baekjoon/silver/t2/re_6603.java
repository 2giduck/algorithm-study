package baekjoon.silver.t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class re_6603 {
    static int n;
    static int[] arr;
    static int[] result;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(String.valueOf(br.read()));
        while(n!=0) {
            int k = Integer.parseInt(br.readLine());
            arr = new int[k+1];
            for(int i = 0; i<n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            result = new int[6];
            visit = new boolean[n];
            backtrack(0, 0);
        }

        System.out.println(sb);
    }

    private static void backtrack(int start, int depth) {
        if(depth == 6) {
            for(int val: result) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i<n; i++)  {
            if(visit[i]) continue;

            visit[i] = true;
            result[depth] = arr[i];
            backtrack(i+1, depth+1);
            visit[i] = false;
        }
    }
}
