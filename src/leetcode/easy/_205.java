package leetcode.easy;

import java.util.HashMap;

public class _205 {
    public static void main(String[] args) {
        String s1 = "egg", s2 = "foo", s3 = "paper";
        String t1 = "add", t2 = "bar", t3 = "title";

        System.err.println(isIsomorphic(s1, t1));
        System.err.println(isIsomorphic(s2, t2));
        System.err.println(isIsomorphic(s3, t3));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        var map = new HashMap<Character, Character>();
        var existMap = new HashMap<Character, Boolean>();
        for (int i = 0; i < s.length(); i++) {
            var sChar = s.charAt(i);
            var tChar = t.charAt(i);

            var temp = map.get(sChar);
            if(temp == null) {
                if(existMap.containsKey(tChar)) return false;
                map.put(sChar, tChar);
                existMap.put(tChar, true);
            }else {
                if(temp != tChar) return false;
            }
        }

        return true;
    }
}
