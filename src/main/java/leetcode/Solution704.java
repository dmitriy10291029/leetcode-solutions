package leetcode;

// https://leetcode.com/problems/binary-search/description/

public class Solution704 {
    public int search(int[] nums, int target) {

//        lazy solution
//        int ans = Arrays.binarySearch(nums, target);
//        return ans < 0 ? -1 : ans;

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

        return nums[mid] == target ? mid : -1;
    }
}
