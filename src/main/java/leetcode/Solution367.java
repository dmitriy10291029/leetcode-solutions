package leetcode;

// https://leetcode.com/problems/valid-perfect-square/description/

public class Solution367 {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num / 2;
        long longNum = num;

        while (l <= r) {
            int mid = ((l + r) / 2);
            long sqrMid = (long) mid * mid;
            if (sqrMid < longNum) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l * l == num;
    }
}