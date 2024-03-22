package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution228Test {
    Solution228 s = new Solution228();

    @Test
    void Test1() {
        int[] i = {0,2,3,4,6,7,10};
        String[] output = {"0","2->4","6->7","10"};
        assertArrayEquals(output, s.summaryRanges(i).toArray());
    }

}