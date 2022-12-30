package leetcode.easy;

public class _278 {

    boolean isBadVersion(int x) {
        return true;
    }

    public int firstBadVersion(int n) {

        int l = 1, r = n;
        int answer = n;
        while(l <= r) {
            int mid =  l + (r-l)/2;

            if(isBadVersion(mid)) {
                answer = mid;
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }

        return answer;
    }

}
