package programmers.level2;
import java.util.*;

public class re_압축 {
    public static void main(String[] args) {
        String m1 = "KAKAO", m2 = "TOBEORNOTTOBEORTOBEORNOT",
                m3 = "ABABABABABABABAB";
        System.err.println(Arrays.toString(solution(m1)));
        System.err.println(Arrays.toString(solution(m2)));
        System.err.println(Arrays.toString(solution(m3)));
    }
    public static int[] solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();
        int idx = 1;
        for(char i = 'A' ; i <= 'Z'; i++) {
            map.put(String.valueOf(i), idx++);
        }

        ArrayList<Integer> list = new ArrayList<>();

        int start = 0;
        int word = 27;
        while(start < msg.length()) {
            if(start == msg.length() -1) {
                list.add(map.get(String.valueOf(msg.charAt(start))));
                break;
            }
            String str = String.valueOf(msg.charAt(start));
            String str2 = str;
            while(map.containsKey(str2)) {
                if(start + 1 == msg.length()) {
                    str = str2;
                    break;
                }
                str = str2;
                str2 = str2 + "" +  msg.charAt(++start);
            }
            if(start + 1 == msg.length()) {
                list.add(map.get(str));
                break;
            }
            list.add(map.get(str));
            map.put(str2, word++); // 사전에 추가
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
