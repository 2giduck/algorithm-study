package baekjoon.silver.t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10451 {

    static StringBuilder sb;
    static int[] arr;
    static boolean[] visit;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        sb = new StringBuilder();
        for(int i = 0; i< t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            arr = new int[n+1];
            visit = new boolean[n+1];

            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            count = 0;
            for(int j = 1; j <= n; j++) {
                if(visit[j]) continue;
                track(j);
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    private static void track(int n){
        if(visit[n]) {
            count++;
            return;
        }

        visit[n] = true;
        var idx = arr[n];
        track(idx);
    }
}
