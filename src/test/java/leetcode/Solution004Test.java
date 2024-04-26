package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution004Test {
    Solution004 s = new Solution004();
    @Test
    void Test1() {
        assertEquals(6, s.findMedianSortedArrays(
                new int[]{1,4,5,7,100},
                new int[]{5,10,30})
        );
    }
    @Test
    void Test2() {
        assertEquals(2.0, s.findMedianSortedArrays(
                new int[]{1,3},
                new int[]{2})
        );
    }
    @Test
    void Test3() {
        assertEquals(2.5, s.findMedianSortedArrays(
                new int[]{1,2},
                new int[]{3,4})
        );
    }
    @Test
    void Test4() {
        assertEquals(1.0, s.findMedianSortedArrays(
                new int[]{1},
                new int[]{})
        );
    }
    @Test
    void Test5() {
        assertEquals(0.0, s.findMedianSortedArrays(
                new int[]{0,0,0,0,0},
                new int[]{-1,0,0,0,0,0,1})
        );
    }

}