package leetcode;

// https://leetcode.com/problems/move-zeroes/description/

public class Solution283 {
    public void moveZeroes(int[] nums) {
        int iterator = 0;

        int lastNonZero = nums.length - 1;
        while (lastNonZero > 0 && nums[lastNonZero] == 0) {
            lastNonZero--;
        }

        while (iterator <= lastNonZero) {
            if (nums[iterator] == 0) {
                for (int j = iterator; j < lastNonZero; ++j) {
                    int t = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = t;
                }
                lastNonZero--;
            } else {
                iterator++;
            }
        }
    }
}