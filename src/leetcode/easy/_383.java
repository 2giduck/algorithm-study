package leetcode.easy;

public class _383 {
    public static void main(String[] args) {
        String r1 = "a", r2 = "aa", r3 = "aa";
        String m1 = "b", m2 = "ab", m3 = "aab";
        System.err.println(canConstruct(r1, m1));
        System.err.println(canConstruct(r2, m2));
        System.err.println(canConstruct(r3, m3));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] arr = new int[26];
        for(char str : magazine.toCharArray()) {
            var temp = str - 97;
            arr[temp] ++;
        }

        for(char str : ransomNote.toCharArray()) {
            var temp = str - 97;
            if(arr[temp] <= 0) return false;
            arr[temp] --;
        }

        return true;
    }
}
