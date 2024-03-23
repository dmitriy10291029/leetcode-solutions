package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution852Test {
    Solution852 s = new Solution852();

    @Test
    void Test1() {
        int[] input = {0,1,0};
        assertEquals(1, s.peakIndexInMountainArray(input));
    }

    @Test
    void Test2() {
        int[] input = {0,2,1,0};
        assertEquals(1, s.peakIndexInMountainArray(input));
    }

    @Test
    void Test3() {
        int[] input = {0,10,5,2};
        assertEquals(1, s.peakIndexInMountainArray(input));
    }

    @Test
    void Test4() {
        int[] input = {12,13,19,41,55,69,70,71,96,72};
        assertEquals(8, s.peakIndexInMountainArray(input));
    }

}