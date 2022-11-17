package leetcode.easy;

public class _704 {
    public static void main(String[] args) {
        int[] n1 = new int[] {-1, 0, 3, 5, 9, 12},
                n2 = new int[] {-1, 0, 3, 5, 9, 12};
        int t1 = 9, t2 = 2;

        System.err.println(search(n1, t1));
        System.err.println(search(n2, t2));
    }

    public static int search(int[] nums, int target) {

        int l = 0, r = nums.length -1;
        int answer = -1;
        while(l <= r) {
            int mid = (l + r)/2;
            if(nums[mid] < target) {
                l = mid + 1;
            } else if(nums[mid] > target) {
                r = mid -1;
            }else {
                answer = mid;
                break;
            }
        }

        return answer;
    }
}
