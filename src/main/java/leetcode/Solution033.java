package leetcode;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

import java.util.Arrays;

public class Solution033 {
    public int search(int[] nums, int target) {
        int l = -1;
        int r = nums.length;
        while (l < r - 1) {
            int m = (l + r) / 2;
            if (nums[m] > nums[nums.length - 1]) {
                l = m;
            } else {
                r = m;
            }
        }
        l = l < 0 ? nums.length - 1 : l;

        if (target >= nums[0]) {
            return Math.max(-1, Arrays.binarySearch(nums, 0, l + 1, target));
        } else {
            return Math.max(-1, Arrays.binarySearch(nums, l + 1, nums.length, target));
        }
    }

    public static void main(String[] args) {
        Solution033 s = new Solution033();
        System.out.println(s.search(new int[]{0,1,2,3,4}, 0));// 5
        System.out.println(s.search(new int[]{10,11,2,3,4}, 2)); //1
        System.out.println(s.search(new int[]{0}, 0));  // 1
        System.out.println(s.search(new int[]{1,3}, 0)); // 0
        System.out.println(s.search(new int[]{3,1}, 1)); // 0
    }
}
