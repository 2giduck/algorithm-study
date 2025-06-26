package baekjoon.silver.t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1051 {

    static String[] arr;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new String[n];
        for(int i = 0; i<n; i++) {
            arr[i] = br.readLine();
        }

        int max = Math.min(n, m);

        int answer = 1;
        for(int i =max; i>=2; i--) {
            if(solve(i)) {
                answer = i*i;
                break;
            }
        }

        System.out.println(answer);
    }

    private static boolean solve(int size) {
        for (int i = 0; i <= n - size; i++) { // 행 인덱스
            for (int j = 0; j <= m - size; j++) { // 열 인덱스
                char a = arr[i].charAt(j);                 // 좌상
                char b = arr[i].charAt(j + size - 1);      // 우상
                char c = arr[i + size - 1].charAt(j);      // 좌하
                char d = arr[i + size - 1].charAt(j + size - 1); // 우하
                if(a == b && b == c && c== d) {
                    return true;
                }
            }
        }

        return false;
    }
}
