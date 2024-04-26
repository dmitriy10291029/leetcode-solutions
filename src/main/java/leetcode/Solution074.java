package leetcode;

// https://leetcode.com/problems/search-a-2d-matrix/description/

public class Solution074 {
    public static boolean binSearch(int[] a, int target) {
        int l = -1;
        int r = a.length;
        while (l < r - 1) {
            int m = (l + r) / 2;
            if (target < a[m]) {
                r = m;
            } else {
                l = m;
            }
        }
        return r == target;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int startRow = 0;
        int endRow = rows - 1;
        while (startRow <= endRow) {
            int midRow = (startRow + endRow) / 2;

            if (target < matrix[midRow][0]) {
                endRow = midRow - 1;
            } else if (matrix[midRow][cols - 1] < target) {
                startRow = midRow + 1;

            } else {
                // middle and upper
                int i = midRow;
                while (i >= 0 && matrix[i][0] <= target && target <= matrix[i][cols - 1]) {
                    if (binSearch(matrix[i], target)) return true;
                    i--;
                }
                // lower than middle
                i = midRow + 1;
                while (i < rows && matrix[i][0] <= target && target <= matrix[i][cols - 1]) {
                    if (binSearch(matrix[i], target)) return true;
                    i++;
                }
                return false;
            }
        }
        return false;
    }
}
