package baekjoon.silver.t4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i<=n; i++) {
            queue.add(i);
        }

        for(int i = 1; i<n; i++) {
            for(int j = 0; j<k-1; j++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll());
        sb.append(">");
        System.out.println(sb);
    }
}
