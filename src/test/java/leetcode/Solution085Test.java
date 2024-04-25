package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution085Test {
    Solution085 s = new Solution085();
    @Test
    void Test1() {
        char[][] m = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        assertEquals(6, s.maximalRectangle(m));
    }

}