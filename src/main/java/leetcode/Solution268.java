package leetcode;

// https://leetcode.com/problems/missing-number/description/

public class Solution268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = (n * (n + 1)) / 2;
        for (int num : nums) {
            ans -= num;
        }
        return ans;
    }
}