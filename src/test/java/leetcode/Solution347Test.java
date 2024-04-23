package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution347Test {
    Solution347 s = new Solution347();
    @Test
    void Test1() {
        assertArrayEquals(new int[]{2,4}, s.topKFrequent(new int[]{1,1,2,2,2,3,4,4,4,4}, 2));
    }

}