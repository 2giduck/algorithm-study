package baekjoon.silver.t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class _1021 {

    static int n;
    static Deque<Integer> queue;
    static int a;
    static int b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 큐 크기
        int m = Integer.parseInt(st.nextToken()); // 뽑을 숫자 수

        Deque<Integer> dq = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            dq.offerLast(i); // 1부터 n까지 넣기
        }

        st = new StringTokenizer(br.readLine());
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int target : targets) {
            int index = 0;
            for (int num : dq) {
                if (num == target) break;
                index++;
            }

            if (index <= dq.size() / 2) {
                // 왼쪽으로 회전
                while (dq.peekFirst() != target) {
                    dq.offerLast(dq.pollFirst());
                    count++;
                }
            } else {
                // 오른쪽으로 회전
                while (dq.peekFirst() != target) {
                    dq.offerFirst(dq.pollLast());
                    count++;
                }
            }

            dq.pollFirst(); // 1번 연산으로 뽑기
        }

        System.out.println(count);
    }
}
