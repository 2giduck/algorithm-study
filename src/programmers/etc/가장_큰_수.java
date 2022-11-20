package programmers.etc;

import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {
    public static void main(String[] args) {
        int[] n1 = new int[] {6,10,2},
                n2 = new int[] {3, 30, 34, 5, 9};
        System.err.println(solution(n1));
        System.err.println(solution(n2));

    }

    public static String solution(int[] numbers) {
        String[] stringNums = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            stringNums[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(stringNums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if(stringNums[0].equals("0")) return "0";

        return String.join("", stringNums);
    }
}
