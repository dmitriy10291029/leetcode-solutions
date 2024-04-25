package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution084Test {
    Solution084 s = new Solution084();
    @Test
    void Test1() {
        assertEquals(13, s.largestRectangleArea(new int[]{1,13,1,4,4,5,2,4,4,1,3}));
    }
}