package leetcode;

// https://leetcode.com/problems/single-number/submissions/1211656471/

public class Solution136 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
