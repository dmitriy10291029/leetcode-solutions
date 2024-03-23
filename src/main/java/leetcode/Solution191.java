package leetcode;

// https://leetcode.com/problems/number-of-1-bits/description/

public class Solution191 {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans += n % 2;
            n /= 2;
        }
        return ans;

        //one line solution
        //return Integer.bitCount(n);
    }
}
