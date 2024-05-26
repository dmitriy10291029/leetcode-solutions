package leetcode;

// https://leetcode.com/problems/subarray-sum-equals-k/description/

import java.util.HashMap;

class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int[] prefSum = new int[nums.length];
        prefSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefSum[i] = prefSum[i - 1] + nums[i];
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int answer = 0;
        for (int i = 0; i < prefSum.length; i++) {

            int target = prefSum[i] - k;
            if (target == 0) {
                answer++;
            }
            if (map.containsKey(target)) {
                int pairs = map.get(target);
                answer += pairs;
            }

            map.merge(prefSum[i], 1, Integer::sum);
        }

        return answer;
    }
}