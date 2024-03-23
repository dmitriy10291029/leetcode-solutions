package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution367Test {
    Solution367 s = new Solution367();

    @Test
    void Test1() {
        int[] sqrs = {1,4,9,16,121,144,1024};
        for (int sqr : sqrs) {
            assertTrue(s.isPerfectSquare(sqr));
        }
    }

    @Test
    void Test2() {
        int[] nonSqrs = {17, 50, 78, 102, 47, 999925};
        for (int nonSqr : nonSqrs) {
            assertFalse(s.isPerfectSquare(nonSqr));
        }
    }

}