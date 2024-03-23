package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    Solution035 s = new Solution035();

    @Test
    void Test1() {
        int[] nums = {1,3,5,6};
        assertEquals(2, s.searchInsert(nums, 5));
    }

    @Test
    void Test2() {
        int[] nums = {1,3,5,6};
        assertEquals(1, s.searchInsert(nums, 2));
    }

    @Test
    void Test3() {
        int[] nums = {1,3,5,6};
        assertEquals(4, s.searchInsert(nums, 7));
    }

    @Test
    void Test4() {
        int[] nums = {1,3,5,6,8,9,15,16,20,26,40};
        assertEquals(8, s.searchInsert(nums, 20));
    }

    @Test
    void Test5() {
        int[] nums = {1,3,5,6,8,9,15,16,20,26,40};
        assertEquals(8, s.searchInsert(nums, 18));
    }

    @Test
    void Test6() {
        int[] nums = {1,3,5,6};
        assertEquals(0, s.searchInsert(nums, 0));
    }
}