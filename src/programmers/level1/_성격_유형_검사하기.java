package programmers.level1;

import java.util.HashMap;

public class _성격_유형_검사하기 {
    public static void main(String[] args) {
        String[] s1 = {"AN", "CF", "MJ", "RT", "NA"},
                s2 = {"TR", "RT", "TR"};
        int[] c1 = {5, 3, 2, 7, 5},
                c2 = {7, 1, 3};
        System.err.println(solution(s1, c1));
        System.err.println(solution(s2, c2));
    }

    public static String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < survey.length; i++) {
            get(map, survey[i], choices[i]);
        }

        String answer = "";
        for (String s : new String[] {"RT", "CF", "JM", "AN"}) {
            int p = map.getOrDefault(s.charAt(0), 0);
            int t = map.getOrDefault(s.charAt(1), 0);

            if(p == t) {
                answer += s.charAt(0);
            }else if( p > t) {
                answer += s.charAt(0);
            }else {
                answer += s.charAt(1);
            }
        }
        return answer;
    }

    public static void get(HashMap<Character, Integer> map, String survey, int choice) {
        Character no = survey.charAt(0);
        Character yes = survey.charAt(1);

        switch(choice) {
            case 1: map.put(no, map.getOrDefault(no, 0) +3); break;
            case 2: map.put(no, map.getOrDefault(no, 0) +2); break;
            case 3: map.put(no, map.getOrDefault(no, 0) +1); break;
            case 4:  break;
            case 5: map.put(yes, map.getOrDefault(yes, 0) +1); break;
            case 6: map.put(yes, map.getOrDefault(yes, 0) +2); break;
            case 7: map.put(yes, map.getOrDefault(yes, 0) +3); break;
        }
    }
}
