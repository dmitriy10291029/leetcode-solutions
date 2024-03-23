package leetcode;

// https://leetcode.com/problems/sqrtx/description/

public class Solution069 {
    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        int l = 1;
        int r = x / 2;
        while (l <= r) {
            int mid = (l + r) / 2;
            long midSqr = (long) mid * mid;
            if (midSqr > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
}
