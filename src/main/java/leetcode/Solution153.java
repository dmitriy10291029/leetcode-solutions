package leetcode;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

public class Solution153 {
    public int findMin(int[] nums) {

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
        //System.out.println(nums[l] + " " + nums[r]);
        return nums[r];
    }
}
