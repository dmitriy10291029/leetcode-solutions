package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution643Test {
    Solution643 s = new Solution643();
    static double eps = 0.00001;

    @Test
    void Example1() {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double output = 12.75;
        assertTrue(Math.abs(s.findMaxAverage(nums, k) - output) < eps);
    }

    @Test
    void Example2() {
        int[] nums = {5};
        int k = 1;
        double output = 5.0;
        assertTrue(Math.abs(s.findMaxAverage(nums, k) - output) < eps);
    }

    @Test
    void Example3() {
        int[] nums = {0,1,1,3,3};
        int k = 4;
        double output = 2.0;
        assertTrue(Math.abs(s.findMaxAverage(nums, k) - output) < eps);
    }
}