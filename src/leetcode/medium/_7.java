package leetcode.medium;

public class _7 {

    public int reverse(int x) {
        boolean isNegative = x < 0;
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x)));
        sb.reverse();

        String reversedStr = sb.toString();
        if (isNegative) {
            reversedStr = "-" + reversedStr;
        }

        try {
            return Integer.parseInt(reversedStr);
        } catch (NumberFormatException e) {
            return 0; // 범위 초과 시 0 반환
        }
    }
}
