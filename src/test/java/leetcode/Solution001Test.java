package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution001Test {
    Solution001 s = new Solution001();

    @Test
    void Example1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] output = {0, 1};
        assertArrayEquals(s.twoSum(nums, target), output);
    }

    @Test
    void Example2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] output = {1, 2};
        assertArrayEquals(s.twoSum(nums, target), output);
    }

    @Test
    void Example3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] output = {0, 1};
        assertArrayEquals(s.twoSum(nums, target), output);
    }

    @Test
    void Example4PairNotInAnswer() {
        int[] nums = {2, 7, 11, 11, 15};
        int target = 9;
        int[] output = {0, 1};
        assertArrayEquals(s.twoSum(nums, target), output);
    }

    @Test
    void Example5PairAndMore() {
        int[] nums = {3, 3, 4};
        int target = 6;
        int[] output = {0, 1};
        assertArrayEquals(s.twoSum(nums, target), output);
    }

    @Test
    void Example6Negative() {
        int[] nums = {3, 5, -6};
        int target = -3;
        int[] output = {0, 2};
        assertArrayEquals(s.twoSum(nums, target), output);
    }
}