package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution69Test {
    Solution69 s = new Solution69();

    @Test
    void Test1() {
        assertEquals(2, s.mySqrt(4));
    }

    @Test
    void Test2() {
        assertEquals(2, s.mySqrt(8));
    }
}