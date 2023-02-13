package programmers.level1;


public class _옹알이_2 {
    public static void main(String[] args) {
        String[] b1 = {"aya", "yee", "u", "maa"},
                b2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.err.println(solution(b1));
        System.err.println(solution(b2));
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        for(String b : babbling) {
            if(getCount(b)) answer++;
        }

        return answer;
    }

    public static boolean getCount(String babbling) {
        String[] temp = {"aya", "ye", "woo", "ma"};

        int prev = -1;
        boolean check = false;
        while(babbling.length() > 0) {
            for (int i = 0; i < temp.length; i++) {
                if(i == prev) continue;

                if(babbling.startsWith(temp[i])) {
                    prev = i;
                    babbling = babbling.substring(temp[i].length());
                    check = true;
                    break;
                }
            }

            if(check) {
                check = false;
            }else {
                return false;
            }
        }

        return true;
    }
}
