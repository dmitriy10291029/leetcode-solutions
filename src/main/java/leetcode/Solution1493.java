package leetcode;

// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/

public class Solution1493 {
    public int longestSubarray(int[] nums) {
        int maxLength = 0;

        int start = 0; // find first 1
        while (nums[start] != 1) {
            start++;
            if (start == nums.length) {
                return maxLength;
            }
        }

        int zeroPos = -1;

        for (int i = start + 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zeroPos == -1) { // first 0 in chain, we can delete it
                    zeroPos = i;

                } else { // second 0, update maxLength
                    maxLength = Math.max(maxLength, i - start - 1);

                    if (i == nums.length - 1) {
                        // 0 was last element
                        return maxLength;

                    } else if (nums[i + 1] == 1) {
                        // if 0 is only one, use it
                        start = zeroPos + 1;
                        zeroPos = i;

                    } else { // if amount of 0 is two or more, find new start
                        start = i + 1;
                        while (nums[start] != 1) {
                            start++;
                            if (start == nums.length) {
                                return maxLength;
                            }
                        }
                        i = start;
                        zeroPos = -1;
                    }
                }
            }
        }

        maxLength = Math.max(maxLength, nums.length - start - (zeroPos == -1 ? 0 : 1));

        return maxLength == nums.length ? maxLength - 1 : maxLength;
    }
}
