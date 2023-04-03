package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;

public class _추억_점수 {
    public static void main(String[] args) {
        String[] n1 = {"may", "kein", "kain", "radi"},
                n2 = {"kali", "mari", "don"},
                n3 = {"may", "kein", "kain", "radi"};
        int[] y1 = {5, 10, 1, 3},
                y2 = {11, 1, 55},
                y3 = {5, 10, 1, 3};
        String[][] p1 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}},
                p2 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}},
                p3 = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};
        System.err.println(Arrays.toString(solution(n1, y1, p1)));
        System.err.println(Arrays.toString(solution(n2, y2, p2)));
        System.err.println(Arrays.toString(solution(n3, y3, p3)));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                answer[i] += map.getOrDefault(photo[i][j], 0);
            }
        }

        return answer;
    }
}
