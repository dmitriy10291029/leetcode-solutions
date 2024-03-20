package leetcode;

public class Solution643 {
    public int findFirstSum(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += nums[i];
        }
        return ans;
    }

    public int findMaxSum(int[] nums, int k) {
        int sum = findFirstSum(nums, k);
        int maxSum = sum;
        for (int i = 0, j = k; j < nums.length; i++, j++) {
            sum = sum - nums[i] + nums[j];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public double findMaxAverage(int[] nums, int k) {
        return ((double) findMaxSum(nums, k)) / k;
    }
}
