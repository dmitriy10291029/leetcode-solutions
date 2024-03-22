package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution941Test {
    Solution941 s = new Solution941();

    @Test
    void Test1() {
        int[] input = {0,3,2,1};
        boolean output = true;
        assertEquals(output, s.validMountainArray(input));
    }

    @Test
    void Test2() {
        int[] input = {0,3,5};
        boolean output = false;
        assertEquals(output, s.validMountainArray(input));
    }

    @Test
    void Test3() {
        int[] input = {4,3,2,1};
        boolean output = false;
        assertEquals(output, s.validMountainArray(input));
    }

    @Test
    void Test4() {
        int[] input = {1,2,3,4,3,2,1,2,3,4};
        boolean output = false;
        assertEquals(output, s.validMountainArray(input));
    }

    @Test
    void Test5() {
        int[] input = {1,2,3,4,5,6,7,6,5,4,3};
        boolean output = true;
        assertEquals(output, s.validMountainArray(input));
    }

    @Test
    void Test6() {
        int[] input = {1,2,3,3,3,2,1};
        boolean output = false;
        assertEquals(output, s.validMountainArray(input));
    }

    @Test
    void Test7() {
        int[] input = {1,3,2};
        boolean output = true;
        assertEquals(output, s.validMountainArray(input));
    }
}