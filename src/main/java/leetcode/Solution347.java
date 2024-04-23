package leetcode;

// https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.ArrayList;
import java.util.HashMap;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i : nums) {
            freqMap.merge(i, 1, Integer::sum);
        }

        ArrayList<Integer>[] freqList = new ArrayList[nums.length + 1];
        for (int i = 0; i < freqList.length; i++) {
            freqList[i] = new ArrayList<>();
        }
        for (var i : freqMap.entrySet()) {
            freqList[i.getValue()].add(i.getKey());
        }

        int[] ans = new int[k];
        int idx = 0;
        for (int i = nums.length; idx < k; i--) {
            for (var j : freqList[i]) {
                ans[idx++] = j;
            }
        }
        return ans;
    }
}
