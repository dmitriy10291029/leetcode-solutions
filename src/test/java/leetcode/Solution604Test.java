package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution604Test {
    Solution604 s = new Solution604();

    @Test
    void Example1() {
        int[] input = {1,0,0,0,0,1};
        int k = 2;
        boolean output = false;
        assertEquals(output, s.canPlaceFlowers(input, k));
    }

}