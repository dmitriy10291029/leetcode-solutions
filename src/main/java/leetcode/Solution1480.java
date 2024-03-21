package leetcode;

// https://leetcode.com/problems/running-sum-of-1d-array/description/

public class Solution1480 {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        if (nums.length == 0) {
            return answer;
        }
        answer[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] + nums[i];
        }
        return answer;
    }
}
