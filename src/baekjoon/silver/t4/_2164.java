package baekjoon.silver.t4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n ; i++) {
            queue.addFirst(i);
        }

        while(queue.size() > 1) {
            queue.pollLast();
            var temp = queue.pollLast();
            queue.addFirst(temp);
        }

        System.out.println(queue.pop());
    }
}
