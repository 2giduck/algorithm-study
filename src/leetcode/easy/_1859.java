package leetcode.easy;

public class _1859 {

    public static void main(String[] args) {
        String s1 = "is2 sentence4 This1 a3",
                s2 = "Myself2 Me1 I4 and3";

        System.err.println(sortSentence(s1));
        System.err.println(sortSentence(s2));
    }

    public static String sortSentence(String s) {
        var splitChar = s.split(" ");

        var result = new String[splitChar.length];
        for(String str : splitChar) {
            String originStr = str.substring(0, str.length()-1);
            int num = Integer.parseInt(str.substring(str.length()-1));
            result[num-1] = originStr;
        }

        return String.join(" ", result);
    }
}
