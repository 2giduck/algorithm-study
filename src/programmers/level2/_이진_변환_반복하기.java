package programmers.level2;

import java.util.Arrays;

public class _이진_변환_반복하기 {
    public static void main(String[] args) {
        String s1 = "110010101001",
                s2 = "01110",
                s3 = "1111111";
        System.err.println(Arrays.toString(solution(s1)));
        System.err.println(Arrays.toString(solution(s2)));
        System.err.println(Arrays.toString(solution(s3)));
    }

    public static int[] solution(String s) {

        int count = 0;
        int zero = 0;
        while(s.length() > 1) {
            int origin = s.length();
            s = s.replaceAll("0", "");
            zero += origin - s.length();
            s = Integer.toBinaryString(s.length());
            count++;
        }

        return new int[] {count, zero};
    }
}
