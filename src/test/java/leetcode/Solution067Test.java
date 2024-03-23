package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution067Test {
    Solution067 s = new Solution067();

    @Test
    void Test1() {
        assertEquals("100", s.addBinary("11", "1"));
    }

    @Test
    void Test2() {
        assertEquals("10101", s.addBinary("1010", "1011"));
    }
}