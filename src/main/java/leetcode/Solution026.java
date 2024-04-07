package leetcode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class Solution026 {
    public int removeDuplicates(int[] nums) {
        int unique = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                nums[unique++] = nums[i];
            }
        }
        return unique;
    }
}
