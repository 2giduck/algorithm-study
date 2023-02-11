package programmers.level1;

public class 문자열_나누기 {
    public static void main(String[] args) {
        String s1 = "banana",
                s2 = "abracadabra",
                s3 = "aaabbaccccabba";
//        System.err.println(solution(s1));
        System.err.println(solution(s2));
        System.err.println(solution(s3));
    }


    public static int solution(String s) {

        int answer = 0;
        while(s.length() > 0) {
            var t = s.charAt(0);

            int temp = 1;
            boolean check = false;
            for (int i = 1; i < s.length(); i++) {
                if(t == s.charAt(i)) temp++;
                else temp--;

                if(temp == 0) {
                    s = s.substring(i+1);
                    answer++; check= true;
                    break;
                }
            }

            if(!check) {
                answer++;
                break;
            }
        }
        return answer;
    }
}
