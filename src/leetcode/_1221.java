package leetcode;

public class _1221 {
    public static void main(String[] args) {
        String s1 = "RLRRLLRLRL", s2 = "RLRRRLLRLL", s3 = "LLLLRRRR";
        System.err.println(balancedStringSplit(s1));
        System.err.println(balancedStringSplit(s2));
        System.err.println(balancedStringSplit(s3));
    }

    public static int balancedStringSplit(String s) {

        int answer = 0;
        int lCount = 0, rCount = 0;
        for(char str : s.toCharArray()) {
            switch(str) {
                case 'L': lCount++; break;
                case 'R': rCount++; break;
            }

            if(lCount == rCount) {
                answer++;
                lCount = 0; rCount = 0;
            }
        }

        return answer;
    }
}
