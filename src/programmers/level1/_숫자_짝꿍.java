package programmers.level1;

import java.util.*;

public class _숫자_짝꿍 {
  public String solution(String X, String Y) {


        int[] yArr = new int[10];
        for(char s : Y.toCharArray()) {
            yArr[s - '0']++;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(char s : X.toCharArray()) {
            var temp = s - '0';

            if(yArr[temp] > 0) {
                yArr[temp]--;
                list.add(temp);
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        if(list.size() == 0) return  "-1";
        if(list.get(0) == 0) return "0";


        StringBuffer sb = new StringBuffer();
        for(int a : list) {
            sb.append(a);
        }

        return sb.toString();
    }
}
