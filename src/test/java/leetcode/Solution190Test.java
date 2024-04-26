package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution190Test {
    Solution190 s = new Solution190();
    @Test
    void Test1() {
        assertEquals(0b00111001011110000010100101000000, s.reverseBits(0b00000010100101000001111010011100));
    }
    @Test
    void Test2() {
        assertEquals(0b10111111111111111111111111111111, s.reverseBits(0b11111111111111111111111111111101));
    }

}