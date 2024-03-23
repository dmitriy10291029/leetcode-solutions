package leetcode;

// https://leetcode.com/problems/hamming-distance/

public class Solution461 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
