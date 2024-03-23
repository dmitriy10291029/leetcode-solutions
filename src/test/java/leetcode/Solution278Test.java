package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution278Test {
    Solution278 s = new Solution278();

    @Test
    void Test1() {
        s.bad = 4;
        assertEquals(s.bad, s.firstBadVersion(5));
    }

    @Test
    void Test2() {
        s.bad = 1;
        assertEquals(s.bad, s.firstBadVersion(1));
    }

}