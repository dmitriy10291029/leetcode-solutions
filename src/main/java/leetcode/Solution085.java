package leetcode;

// https://leetcode.com/problems/maximal-rectangle/description/

import java.util.Arrays;

public class Solution085 {
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

    public int maximalRectangle(char[][] matrix) {
        int[][] hist = new int[matrix.length][matrix[0].length];
        int lastRow = matrix.length - 1;
        for (int col = 0; col < matrix[0].length; col++) {
            if (matrix[lastRow][col] == '1') {
                hist[lastRow][col] = 1;
            }
        }
        int max = largestRectangleArea(hist[lastRow]);
        for (int row = matrix.length - 2; row >= 0; row--) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] != '0') {
                    if (matrix[row + 1][col] != '0') {
                        hist[row][col] = hist[row + 1][col] + 1;
                    } else {
                        hist[row][col] = 1;
                    }
                }
            }
            max = Math.max(max, largestRectangleArea(hist[row]));
        }
        return max;
    }
}
