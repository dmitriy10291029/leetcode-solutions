package leetcode;

// https://leetcode.com/problems/3sum/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int l = 0; l < nums.length - 2; l++) {
            int m = l + 1;
            int r = nums.length - 1;
            while (m < r) {
                int lastM, lastR, sum = nums[l] + nums[r] + nums[m];
                if (sum == 0) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[l]);
                    triplet.add(lastM = nums[m]);
                    triplet.add(lastR = nums[r]);
                    ans.add(triplet);
                    while (m < r && nums[r] == lastR) r--;
                    while (m < r && nums[m] == lastM) m++;
                } else if (sum > 0) {
                    lastR = nums[r];
                    while (m < r && nums[r] == lastR) r--;
                } else {
                    lastM = nums[m];
                    while (m < r && nums[m] == lastM) m++;
                }
            }
            while (l < nums.length - 2 && nums[l] == nums[l + 1]) l++;
        }
        return ans;
    }
}
