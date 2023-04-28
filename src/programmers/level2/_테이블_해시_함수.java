package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class _테이블_해시_함수 {

  public int solution(int[][] data, int col, int row_begin, int row_end) {
    Arrays.sort(data, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        int base = col - 1;
        if(o1[base] == o2[base]) {
          return o2[0] - o1[0];
        }
        return o1[base] - o2[base];
      }
    });


    int answer = -1;
    for(int i = row_begin; i<=row_end; i++) {
      int sum = 0;
      for(int k = 0 ; k<data[i-1].length; k++) {
        sum += data[i-1][k] % i;
      }

      if(answer == -1) {
        answer = sum;
      }else {
        answer = sum^answer;
      }
    }
    return answer;
  }
}
