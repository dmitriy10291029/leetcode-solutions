package leetcode;

public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int start = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                int currentLen = i - start;
                if (max < currentLen) {
                    max = currentLen;
                }
                start = i;
            }
        }
        int currentLen = nums.length - start;
        if (max < currentLen) {
            max = currentLen;
        }
        return max;
    }
}
