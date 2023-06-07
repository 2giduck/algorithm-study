package baekjoon.gold.t5;

import java.util.*;

public class _2251 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] now = new int[3];
        now[0] = sc.nextInt();
        now[1] = sc.nextInt();
        now[2] = sc.nextInt();

        int[] sender = {0, 0, 1, 1, 2, 2};
        int[] receiver = {1, 2, 0, 2, 0, 1};

        boolean[][] visited = new boolean[201][201];
        boolean[] answer = new boolean[201];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));
        answer[now[2]] = true;
        visited[0][0] = true;
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            int a = node.a;
            int b = node.b;
            int c = now[2] - (a + b);
            for(int k = 0; k < 6; k++) {
                int[] next = {a, b, c};
                next[receiver[k]] += next[sender[k]];
                next[sender[k]] = 0;
                if(next[receiver[k]] > now[receiver[k]]) {
                    next[sender[k]] = next[receiver[k]] - now[receiver[k]];
                    next[receiver[k]] = now[receiver[k]];
                }
                if(visited[next[0]][next[1]]) continue;
                visited[next[0]][next[1]] = true;
                queue.add(new Node(next[0], next[1]));
                if(next[0] == 0) {
                    answer[next[2]] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< answer.length; i++) {
            if(answer[i]) {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);
    }

    static class Node {
        int a;
        int b;

        public Node(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
