package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution153Test {
    Solution153 s = new Solution153();
    @Test
    void Test1() {
        assertEquals(1, s.findMin(new int[]{3,4,5,1,2}));
    }
    @Test
    void Test2() {
        assertEquals(0, s.findMin(new int[]{4,5,6,7,0,1,2}));
    }
    @Test
    void Test3() {
        assertEquals(11, s.findMin(new int[]{11,13,15,17}));
    }
    @Test
    void Test4() {
        assertEquals(1, s.findMin(new int[]{4,5,1,2,3}));
    }
    @Test
    void Test5() {
        assertEquals(1, s.findMin(new int[]{1}));
    }
}