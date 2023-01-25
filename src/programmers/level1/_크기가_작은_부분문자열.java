package programmers.level1;

public class _크기가_작은_부분문자열 {
    public static void main(String[] args) {
        String t = "3141592", p = "271";
        String t3 = "10203", p3 = "15";
//        System.err.println(solution(t, p));
        System.err.println(solution(t3, p3));
    }

    public static int solution(String t, String p) {
        var length = p.length();

        int answer = 0;
        var compare = Long.parseLong(p);
        for (int i = 0; i <= t.length() - length ; i++) {
            var temp = t.substring(i, i+length);
            if(Long.parseLong(temp)<=compare) {
                answer++;
            }
        }

        return answer;
    }
}
