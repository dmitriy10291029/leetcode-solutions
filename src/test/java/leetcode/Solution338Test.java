package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution338Test {
    Solution338 s = new Solution338();

    @Test
    void Example1() {
        int input = 2;
        int[] output = {0,1,1};
        assertArrayEquals(output, s.countBits(input));
    }

    @Test
    void Example2() {
        int input = 5;
        int[] output = {0,1,1,2,1,2};
        assertArrayEquals(output, s.countBits(input));
    }
}