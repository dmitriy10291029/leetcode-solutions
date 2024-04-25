package leetcode;

// https://leetcode.com/problems/largest-rectangle-in-histogram/

import java.util.Arrays;

public class Solution084 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        
        int[] stack = new int[n];
        int head = -1;
        
        int[] nextArr = new int[n];
        Arrays.fill(nextArr, n);
        for (int i = 0; i < n; i++) {
            while (head >= 0 && heights[i] < heights[stack[head]]) {
                nextArr[stack[head]] = i;
                head--;
            }
            stack[++head] = i;
        }

        head = -1;
        int[] prevArr = new int[n];
        Arrays.fill(prevArr, -1);
        for (int i = n - 1; i >= 0; i--) {
            while (head >= 0 && heights[i] < heights[stack[head]]) {
                prevArr[stack[head]] = i;
                head--;
            }
            stack[++head] = i;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(heights[i] * (nextArr[i] - prevArr[i] - 1), max);
        }

        return max;
    }
}
