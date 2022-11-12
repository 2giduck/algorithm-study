package leetcode.easy;

public class re_392 {
    public static void main(String[] args) {
        String s1 = "abc", s2= "axc";
        String t1 = "ahbgdc", t2 = "ahbgdc";
        System.err.println(isSubsequence(s1, t1));
        System.err.println(isSubsequence(s2, t2));
    }

    public static boolean isSubsequence(String s, String t) {

        var count = -1;
        for (char str : s.toCharArray()) {
            int index = t.indexOf(str);
            if(index == -1) return false;
            if(index < count) return false;
            t = t.substring(0, index) + t.substring(index+1);
            count = index;
        }

        return true;
    }
}
