package leetcode.medium;

import java.util.HashMap;

public class _299 {
    public static void main(String[] args) {
        String s1 = "1807", s2 = "1123";
        String g1 = "7810", g2 = "0111";
        System.err.println(getHint(s1, g1));
        System.err.println(getHint(s2, g2));
    }

    public static String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char s : secret.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) +1);
        }

        var x = 0;
        var y = 0;

        boolean[] arr = new boolean[secret.length()];
        for (int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                x++;
                arr[i] = true;
                map.put(secret.charAt(i), map.get(secret.charAt(i))-1);
            }
        }

        for (int i = 0; i < guess.length(); i++) {
            if(!arr[i] && map.containsKey(guess.charAt(i)) && map.get(guess.charAt(i)) != 0){
                y++;
                map.put(guess.charAt(i), map.get(guess.charAt(i))-1);
            }
        }

        return x + "A" + y + "B";
    }
}
