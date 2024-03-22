package leetcode;

// https://leetcode.com/problems/longest-continuous-increasing-subsequence/submissions/1210936081/

public class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int maxLengthOfSequence = 0;
        int startOfLastSequence = 0;
        int lengthOfLastSequence = 0;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] >= nums[i]) {
                lengthOfLastSequence = i - startOfLastSequence;
                if (maxLengthOfSequence < lengthOfLastSequence) {
                    maxLengthOfSequence = lengthOfLastSequence;
                    if (maxLengthOfSequence > nums.length - maxLengthOfSequence) {
                        return maxLengthOfSequence;
                    }
                }
                startOfLastSequence = i;
            }
        }
        lengthOfLastSequence = nums.length - startOfLastSequence;
        if (maxLengthOfSequence < lengthOfLastSequence) {
            maxLengthOfSequence = lengthOfLastSequence;
        }

        return maxLengthOfSequence;
    }
}
