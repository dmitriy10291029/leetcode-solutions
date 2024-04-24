package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution011Test {
    Solution011 s = new Solution011();

    @Test
    void Test1() {
        assertEquals(49, s.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}