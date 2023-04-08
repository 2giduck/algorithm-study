package programmers.level1;

import java.util.HashMap;

public class _대충_만든_자판 {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(String key : keymap) {
            for(int i = 0; i<key.length(); i++) {
                var tmp = map.getOrDefault(key.charAt(i), Integer.MAX_VALUE);
                tmp = Math.min(i+1, tmp);
                map.put(key.charAt(i), tmp);
            }
        }

        int[] answer = new int[targets.length];
        int idx = 0;
        for(String target : targets) {
            for(int i = 0; i<target.length(); i++) {
                if(map.containsKey(target.charAt(i))) {
                    answer[idx] += map.get(target.charAt(i));
                }else {
                    answer[idx] = -1;
                    break;
                }
            }
            idx++;
        }

        return answer;
    }
}
