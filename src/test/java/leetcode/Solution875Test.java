package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution875Test {
    Solution875 s = new Solution875();
    @Test
    void Test1() {
        int[] piles = new int[]{3,6,7,11};
        assertEquals(4, s.minEatingSpeed(piles, 8));
    }
    @Test
    void Test2() {
        int[] piles = new int[]{30,11,23,4,20};
        assertEquals(30, s.minEatingSpeed(piles, 4));
    }
    @Test
    void Test3() {
        int[] piles = new int[]{30,11,23,4,20};
        assertEquals(23, s.minEatingSpeed(piles, 6));
    }

    @Test
    void Test4() {
        int[] piles = new int[]{312884470};
        assertEquals(2, s.minEatingSpeed(piles, 312884469));
    }

    @Test
    void Test5() {
        int[] piles = new int[]{70};
        assertEquals(2, s.minEatingSpeed(piles, 69));
    }

    @Test
    void Test6() {
        int[] piles = new int[]{312884470};
        assertEquals(1, s.minEatingSpeed(piles, 968709470));
    }
}