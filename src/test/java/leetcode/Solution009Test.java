package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution009Test {
    Solution009 s = new Solution009();

    @Test
    void Example1() {
        assertTrue(s.isPalindrome(121));
    }

    @Test
    void Example2() {
        assertFalse(s.isPalindrome(-121));
    }

    @Test
    void Example3() {
        assertFalse(s.isPalindrome(10));
    }

    @Test
    void Example4() {
        assertTrue(s.isPalindrome(123454321));
    }

    @Test
    void Example5() {
        assertTrue(s.isPalindrome(12344321));
    }

    @Test
    void Example6() {
        assertTrue(s.isPalindrome(11));
    }

    @Test
    void Example7() {
        assertFalse(s.isPalindrome(12354321));
    }

    @Test
    void Example8() {
        assertFalse(s.isPalindrome(12344322));
    }
}