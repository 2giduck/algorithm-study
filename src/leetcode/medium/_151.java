package leetcode.medium;

public class _151 {

    public String reverseWords(String s) {
        String replaceStr = s.replaceAll("\\s+", " ").trim();
        String[] strArr = replaceStr.split(" ");

        StringBuilder answer = new StringBuilder();
        for(int i = strArr.length-1; i>=0; i--) {
            answer.append(strArr[i]);
            if(i != 0) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}
