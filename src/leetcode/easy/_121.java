package leetcode.easy;

public class _121 {
    public static void main(String[] args) {
        int[] p1 = new int[] {7,1,5,3,6,4},
                p2 = new int[] {7,6,4,3,1};
        System.err.println(maxProfit(p1));
        System.err.println(maxProfit(p2));
    }

    public static int maxProfit(int[] prices) {

        int max = prices[0];
        int answer = -1;
        for (int i = 1; i < prices.length; i++) {
            var price = prices[i];

            if(price - max > answer) {
                answer = price - max;
            }
            if(max > price) {
                max = price;
            }
        }

        return Math.max(answer, 0);
    }
}
