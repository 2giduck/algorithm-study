package programmers.level1;

import java.util.HashMap;

public class _달리기_경주 {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<players.length; i++) {
            map.put(players[i], i);
        }

        for(int i = 0; i<callings.length; i++) {
            var find = callings[i];
            var idx = map.get(find);

            map.put(players[idx], idx-1);
            map.put(players[idx-1], idx);

            var tmp = players[idx];
            players[idx] = players[idx-1];
            players[idx-1] = tmp;
        }

        return players;
    }
}
