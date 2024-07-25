package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution207Test {
    Solution207 s = new Solution207();

    @Test
    void Test1() {
        assertEquals(false, s.canFinish(2, new int[][] {{1, 0},{0, 1}}));
    }
}