package leetcode;

// https://leetcode.com/problems/trapping-rain-water/description/

public class Solution042 {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int r_max = 0;
        int l_max = 0;
        int count = 0;

        while (l < r) {
            r_max = Math.max(r_max, height[r]);
            l_max = Math.max(l_max, height[l]);
            if (height[l] <= height[r]) {
                count += Math.min(r_max, l_max) - height[l];
                l++;
            } else {
                count += Math.min(r_max, l_max) - height[r];
                r--;
            }
        }

        return count;
    }
}
