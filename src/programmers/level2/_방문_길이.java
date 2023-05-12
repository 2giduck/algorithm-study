package programmers.level2;

import java.util.HashSet;

public class _방문_길이 {

    public static void main(String[] args) {
        String d1 = "ULURRDLLU",d2 = "LULLLLLLU";
        System.err.println(solution(d1));
        System.err.println(solution(d2));
    }

    public static int solution(String dirs) {

        var x = 0;
        var y = 0;
        int answer = 0;
        HashSet<String> set = new HashSet<>();
        for(char dir :dirs.toCharArray()) {
            int dx = x, dy = y;
            switch(dir) {
                case 'U': dy++; break;
                case 'D': dy--; break;
                case 'R': dx++; break;
                case 'L': dx--; break;
            }

            if(dx < -5 || dx > 5 || dy < -5 || dy > 5) continue;
            String value1 = x + "" + y + "" + dx + "" + dy;
            String value2 = dx + "" + dy + "" + x + "" + y;
            if(!set.contains(value1) && !set.contains(value2)) {
                set.add(value1);
                set.add(value2);
                answer++;
            }
            x = dx; y= dy;
        }

        return answer;
    }
}
