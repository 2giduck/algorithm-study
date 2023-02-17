package programmers.level1;

import java.util.*;

public class _둘만의_암호 {
    public static void main(String[] args) {
        String s = "aukks", skip = "wbqd";
        int index = 5;
        System.err.println(solution(s, skip, index));
    }

    public static String solution(String s, String skip, int index) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Integer, Character> map2 = new HashMap<>();
        int idx = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            if(!skip.contains(i + "")) {
                map.put(i, idx);
                map2.put(idx++, i);
            }
        }

        String answer = "";
        for(char str: s.toCharArray()) {
            var temp = map.get(str) + index;
            if(temp >= map.size()) {
                temp = temp % map.size();
            }
            answer += map2.get(temp);
        }

        return answer;
    }
}
