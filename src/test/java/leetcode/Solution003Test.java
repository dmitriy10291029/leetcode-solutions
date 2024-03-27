package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution003Test {
    Solution003 s = new Solution003();

    @Test
    void Test1() {
        assertEquals(2, s.lengthOfLongestSubstring("aab"));
    }

    @Test
    void Test2() {
        assertEquals(3, s.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void Test3() {
        assertEquals(3, s.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void Test4() {
        assertEquals(5, s.lengthOfLongestSubstring("tmmzuxt"));
    }

    @Test
    void Test5() {
        assertEquals(2, s.lengthOfLongestSubstring("abba"));
    }

}