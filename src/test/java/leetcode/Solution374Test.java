package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution374Test {
    Solution374 s = new Solution374();

    @Test
    void Test1() {
        s.pick = 6;
        assertEquals(s.pick, s.guessNumber(10));
    }

    @Test
    void Test2() {
        s.pick = 1;
        assertEquals(s.pick, s.guessNumber(1));
    }

    @Test
    void Test3() {
        s.pick = 1;
        assertEquals(s.pick, s.guessNumber(2));
    }

}