package baekjoon.gold.t5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class re_14891 {

    static ArrayList<Character>[] gears;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        gears = new ArrayList[4];
        for(int i = 0; i < gears.length; i++) {
            gears[i] = new ArrayList<>();
            var gear = br.readLine().toCharArray();
            for(int j = 0; j< 8; j++) {
                gears[i].add(gear[j]);
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        for(int i = 0; i<k; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int direct = Integer.parseInt(st.nextToken());
        }
    }
}
