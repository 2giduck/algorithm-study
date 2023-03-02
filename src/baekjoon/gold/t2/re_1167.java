package baekjoon.gold.t2;

import java.util.*;

public class re_1167 {

    static int max;
    static ArrayList<Integer[]>[] list;
    static int[] dist;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        list = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            list[i] = new ArrayList<>();
        }
    }
}
