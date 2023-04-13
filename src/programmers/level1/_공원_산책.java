package programmers.level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _공원_산책 {
    public static void main(String[] args) {
//        System.err.println(Arrays.toString(solution(new String[] {"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"})));
//        System.err.println(Arrays.toString(
//                solution(new String[] {"SOO", "OXX", "OOO"},
//                        new String[]{"E 2", "S 2", "W 1"})));
        System.err.println(Arrays.toString(
                solution(new String[] {"OOXOS","OOOOO","OOOOO", "OOOOO", "OOOOO"},
                        new String[]{"W 3"})));
    }
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        boolean check = false;
        for(int i = 0; i<park.length; i++) {
            if(park[i].contains("S")) {
                int idx = park[i].indexOf("S");
                check = true;
                answer[0] = i;
                answer[1] = idx;
            }
            if(check) break;
        }

        for(String route : routes) {
            int[] dir = new int[2];
            var tmp = route.charAt(2) - '0';
            switch(route.charAt(0)) {
                case 'E':
                    dir[1] = tmp; break;
                case 'S':
                    dir[0] = tmp; break;
                case 'W':
                    dir[1] = tmp * -1 ; break;
                case 'N':
                    dir[0] = tmp * -1 ; break;
            }

            int dx = dir[0] + answer[0];
            int dy = dir[1] + answer[1];
            if(dx < 0 || dy < 0 || dx >= park.length || dy >= park[0].length()) continue;
            boolean c = false;
            for(int i = Math.min(answer[0], dx); i<=Math.max(answer[0], dx); i++) {
                if(park[i].charAt(dy) == 'X') {
                    c = true;
                    break;
                }
            }
            for(int i = Math.min(answer[1], dy); i<=Math.max(dy, answer[1]) ; i++) {
                if(park[dx].charAt(i) == 'X') {
                  c = true;
                  break;
                }
            }
            if(c) continue;
            answer[0] = dx;
            answer[1] = dy;
        }

        return answer;
    }
}
