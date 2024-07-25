package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class Solution994 {
    private static final int EMPTY = 0;
    private static final int FRESH = 1;
    private static final int ROTTEN = 2;

    private static class Cell {
        public int x, y;
        public Cell(int x_, int y_) {
            x = x_;
            y = y_;
        }
    }

    public int orangesRotting(int[][] grid) {
        ArrayDeque<Cell> queue = new ArrayDeque<>();

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == ROTTEN) {
                    queue.add(new Cell(x, y));
                }
            }
        }

        int[][] nearestPositions = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        int time = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Cell cell = queue.pollFirst();

                for (var pos : nearestPositions) {
                    int x0 = cell.x + pos[0], y0 = cell.y + pos[1];
                    if (isInBorders(x0, y0, grid) && grid[y0][x0] == FRESH) {
                        queue.add(new Cell(x0, y0));
                        grid[y0][x0] = ROTTEN;
                    }
                }
            }
            if (!queue.isEmpty()) {
                time++;
            }
        }

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == FRESH) {
                    return -1;
                }
            }
        }

        return time;
    }

    private boolean isInBorders(int x, int y, int[][] grid) {
        return 0 <= x && x < grid[0].length &&
                0 <= y && y < grid.length;
    }
}
