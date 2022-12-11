package programmers.etc;

import java.util.*;

public class re_선후수_수강 {
    public static void main(String[] args) {
        String[] s1 = new String[] {"A", "E", "B", "D", "B", "H", "F", "H", "C"},
                s2 = new String[] {"G", "C", "G", "F", "J", "E", "B", "F", "B"};
        String[] b1 = new String[] {"A", "E", "B", "D", "B", "H", "F", "H", "C"},
                b2 = new String[] {"G", "C", "G", "F", "J", "E", "B", "F", "B"};
        System.err.println(Arrays.toString(solution(s1, s2, "B")));
        System.err.println(Arrays.toString(solution(b1, b2, "G")));
    }

    public static String[] solution(String[] s1, String[] s2, String k) {
        return null;
    }
}
