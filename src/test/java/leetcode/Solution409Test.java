package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution409Test {
    Solution409 s = new Solution409();

    @Test
    void Test1() {
        assertEquals(7, s.longestPalindrome("abccccdd"));
    }

    @Test
    void Test2() {
        assertEquals(1, s.longestPalindrome("a"));
    }

}