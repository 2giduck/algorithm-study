package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class re_튜플 {
    public static void main(String[] args) {
        String s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}",
                s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}",
                s3 = "{{20,111},{111}}",
                s4 = "{{123}}",
                s5 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        System.err.println(Arrays.toString(solution(s1)));
        System.err.println(Arrays.toString(solution(s2)));
        System.err.println(Arrays.toString(solution(s3)));
        System.err.println(Arrays.toString(solution(s4)));
        System.err.println(Arrays.toString(solution(s5)));
    }

    public static int[] solution(String s) {
        return null;
    }
}
