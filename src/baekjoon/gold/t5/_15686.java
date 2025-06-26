package baekjoon.gold.t5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _15686 {

    static List<Point> houses;
    static List<Point> chickens;
    static int m;
    static int min;

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        houses = new ArrayList<Point>();
        chickens = new ArrayList<Point>();
        for(int i = 1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=n; j++) {
                int point = Integer.parseInt(st.nextToken());
                if(point == 1) { // 집
                    houses.add(new Point(i, j));
                }else if(point == 2) { // 치킨집
                    chickens.add(new Point(i, j));
                }
            }
        }

        var list = new ArrayList<Point>();
        min = Integer.MAX_VALUE;
        backtrack(list, 0, 0);


        System.out.println(min);
    }

    private static void backtrack(List<Point> list, int depth, int idx) {
        if(depth == m) {
            int distance = calDistance(list);
            min = Math.min(distance, min);
            return;
        }

        for(int i = idx ; i < chickens.size(); i++) {
            Point point = chickens.get(i);
            list.add(point);
            backtrack(list, depth + 1, i + 1);
            list.remove(point);
        }
    }

    private static int calDistance(List<Point> combinations) {
        int result = 0;
        for(Point c : houses) {
            int min = Integer.MAX_VALUE;
            for(Point chic: combinations) {
                min = Math.min(min, Math.abs(c.x - chic.x) + Math.abs(c.y - chic.y));
            }
            result += min;
        }

        return result;
    }
}
