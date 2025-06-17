package baekjoon.silver.t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class _1063 {
    static Map<String, int[]> map = Map.of(
            "R", new int[]{1, 0},
            "L", new int[]{-1, 0},
            "B", new int[]{0, -1},
            "T", new int[]{0, 1},
            "RT", new int[]{1, 1},
            "LT", new int[]{-1, 1},
            "RB", new int[]{1, -1},
            "LB", new int[]{-1, -1}
    );
    static Map<String, Integer> map2 = Map.of(
            "A", 1,
            "B", 2,
            "C", 3,
            "D", 4,
            "E", 5,
            "F", 6,
            "G", 7,
            "H", 8
    );
    static Map<Integer, String> map3 = Map.of(
            1, "A",
            2, "B",
            3, "C",
            4, "D",
            5, "E",
            6, "F",
            7, "G",
            8, "H"
    );

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        var k = st.nextToken();
        String[] king = k.split("");
        var r = st.nextToken();
        String[] rock = r.split("");
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i<n; i++) {
            var tmp = br.readLine();
            var k1 = map2.get(king[0]);
            var k2 = Integer.parseInt(king[1]);
            var value = map.get(tmp);
            var nextK1 = k1 + value[0];
            var nextK2 = k2 + value[1];
            if(nextK1 < 1 || nextK1 > 8 || nextK2 < 1 || nextK2 >8) {
                continue;
            }

            var r1 = map2.get(rock[0]);
            var r2 = Integer.parseInt(rock[1]);
            if(r1 == nextK1 && r2 == nextK2) { // 돌의 위치와 같다면
                var nextR1 = r1 + value[0];
                var nextR2 = r2 + value[1];
                if(nextR1 < 1 || nextR1 > 8 || nextR2 < 1 || nextR2 >8) {
                    continue;
                }
                rock[0] = map3.get(nextR1);
                rock[1] = String.valueOf(nextR2);
            }

            king[0] =  map3.get(nextK1);
            king[1] = String.valueOf(nextK2);
        }

        System.out.println(king[0] + king[1]);
        System.out.println(rock[0] + rock[1]);
    }
}
