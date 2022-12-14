

package programmers.level1;

public class _푸드_파이트_대회 {

    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        
        for(int i = 1; i<food.length; i++) {
            for(int j = 1 ; j<=food[i]/2; j++) {
                sb.append(i);
            }
        }
        var origin = sb.toString();
        var reverse = sb.reverse().toString();
        
        return origin + "0" + reverse;
    }
}
