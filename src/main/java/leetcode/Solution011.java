package leetcode;

// https://leetcode.com/problems/container-with-most-water/description/

public class Solution011 {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while (r > l) {
            int minH = Math.min(height[r], height[l]);
            max = Math.max(max, minH * (r - l));
            while (r >= l && height[l] <= minH) l++;
            while (r >= l && height[r] <= minH) r--;
        }
        return max;
    }
}
