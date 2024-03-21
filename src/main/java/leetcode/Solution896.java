package leetcode;

// https://leetcode.com/problems/monotonic-array/

public class Solution896 {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < nums.length && (isDecreasing || isIncreasing); ++i) {
            isIncreasing &= nums[i - 1] <= nums[i];
            isDecreasing &= nums[i - 1] >= nums[i];
        }

        return isIncreasing || isDecreasing;
    }
}
