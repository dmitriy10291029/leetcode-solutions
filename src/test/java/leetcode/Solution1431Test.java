package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1431Test {
    Solution1431 s = new Solution1431();

    @Test
    void Example1() {
        int[] candies = {4,2,1,1,2};
        int extra = 1;
        Boolean[] answer = new Boolean[candies.length];
        Boolean[] output = {true,false,false,false,false};
        assertArrayEquals(output, s.kidsWithCandies(candies, extra).toArray(answer));
    }

}