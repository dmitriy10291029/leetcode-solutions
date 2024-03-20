package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution283Test {
    Solution283 s = new Solution283();

    @Test
    void Example1() {
        int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {1,3,12,0,0};

        s.moveZeroes(nums1);
        assertArrayEquals(nums2, nums1);
    }

    @Test
    void Example2() {
        int[] nums1 = {0};
        int[] nums2 = {0};

        s.moveZeroes(nums1);
        assertArrayEquals(nums2, nums1);
    }
}