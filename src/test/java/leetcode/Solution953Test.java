package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution953Test {
    Solution953 s = new Solution953();

    @Test
    void Test1() {
        String[] i1 = {"hello","leetcode"};
        String i2 = "hlabcdefgijkmnopqrstuvwxyz";
        assertTrue(s.isAlienSorted(i1, i2));
    }
}