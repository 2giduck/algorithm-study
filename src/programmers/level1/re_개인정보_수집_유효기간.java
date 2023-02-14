package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class re_개인정보_수집_유효기간 {
    public static void main(String[] args) {
        String t1 = "2022.05.19",
                t2 = "2020.01.01";
        String[] te1 = {"A 6", "B 12", "C 3"},
                te2 = {"Z 3", "D 5"};
        String[] p1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"},
                p2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        System.err.println(Arrays.toString(solution(t1, te1, p1)));
        System.err.println(Arrays.toString(solution(t2, te2, p2)));
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        return null;
    }
}
