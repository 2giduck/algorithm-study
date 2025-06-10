package baekjoon.bronze.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String[] arr = new String[5];
        int max = 0;
        for(int i = 0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
            max = Math.max(max, arr[i].length());
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< max;i++) {
            for(int j = 0; j<5; j++) {
                if(i >= arr[j].length()) continue;
                var ch = arr[j].charAt(i);
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
