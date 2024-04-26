package leetcode;

// https://leetcode.com/problems/reverse-bits/

public class Solution190 {
    public int reverseBits(int n) {
        int m = 0;
        for (int i = 31; i >= 0; i--) {
            m |= (n & 1) << i;
            n >>= 1;
        }
        return m;
    }
}
