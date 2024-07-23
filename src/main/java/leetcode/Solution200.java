package leetcode;

// https://leetcode.com/problems/number-of-islands/

public class Solution200 {
    public int numIslands(char[][] grid) {
        int maxArea = 0;

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == '1') {
                    maxArea = Math.max(maxArea, dfs(x, y, grid, 0));
                }
            }
        }

        return maxArea;
    }

    private int dfs(int x, int y, char[][] grid, int area) {
        if (0 <= x && x < grid[0].length && 0 <= y && y < grid.length && grid[y][x] == '1') {
            grid[y][x] = '0';
            area++;
            area = dfs(x, y + 1, grid, area);
            area = dfs(x, y - 1, grid, area);
            area = dfs(x + 1, y, grid, area);
            area = dfs(x - 1, y, grid, area);
        }
        return area;
    }
}
