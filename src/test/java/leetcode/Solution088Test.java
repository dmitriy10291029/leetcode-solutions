package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution088Test {
    Solution088 s = new Solution088();

    @Test
    void Test1() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        int[] o = {1,2,2,3,5,6};
        s.merge(nums1, m, nums2, n);
        assertArrayEquals(o, nums1);
    }

}