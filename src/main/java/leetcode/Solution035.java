package leetcode;

// https://leetcode.com/problems/search-insert-position/

public class Solution035 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid = right / 2;

        while (right - left > 1) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
            mid = (right + left) / 2;
        }

        return target > nums[mid] ? mid + 1 : mid;
    }
}