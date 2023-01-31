package leetcode.medium;

public class _11 {
    public int maxArea(int[] height) {
        var result = Integer.MIN_VALUE;

        for(int i = 0; i < height.length-1; i++) {
            for(int j = i+1; j < height.length; j++) {
                var size = (j - i) * Math.min(height[i], height[j]);
                result = Math.max(size, result);
            }
        }
        return result;
    }
}
