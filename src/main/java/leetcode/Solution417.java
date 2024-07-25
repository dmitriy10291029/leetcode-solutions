package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Solution417 {
    private static class Cell {
        public int x, y;
        public Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        boolean[][] hasRouteA = new boolean[n][m];
        boolean[][] hasRouteP = new boolean[n][m];
        ArrayDeque<Cell> dequeP = new ArrayDeque<>();
        ArrayDeque<Cell> dequeA = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            hasRouteP[i][0] = true;
            dequeP.add(new Cell(0, i));

            hasRouteA[i][m - 1] = true;
            dequeA.add(new Cell(m - 1, i));
        }

        for (int i = 0; i < m; i++) {
            hasRouteP[0][i] = true;
            dequeP.add(new Cell(i, 0));

            hasRouteA[n - 1][i] = true;
            dequeA.add(new Cell(i, n - 1));
        }

        int[][] nearestPositions = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};



        while (!dequeP.isEmpty()) {
            Cell cell = dequeP.pollFirst();
            int h = heights[cell.y][cell.x];
            for (var pos : nearestPositions) {
                int x0 = cell.x + pos[0], y0 = cell.y + pos[1];
                if (isInBorders(x0, y0, n, m) && !hasRouteP[y0][x0] && h <= heights[y0][x0]) {
                    hasRouteP[y0][x0] = true;
                    dequeP.add(new Cell(x0, y0));
                }
            }
        }

        while (!dequeA.isEmpty()) {
            Cell cell = dequeA.pollFirst();
            int h = heights[cell.y][cell.x];
            for (var pos : nearestPositions) {
                int x0 = cell.x + pos[0], y0 = cell.y + pos[1];
                if (isInBorders(x0, y0, n, m) && !hasRouteA[y0][x0] && h <= heights[y0][x0]) {
                    hasRouteA[y0][x0] = true;
                    dequeA.add(new Cell(x0, y0));
                }
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {
                if (hasRouteP[y][x] && hasRouteA[y][x]) {
                    answer.add(List.of(y, x));
                }
            }
        }

        return answer;
    }

    boolean isInBorders(int x, int y, int n, int m) {
        return 0 <= x && x < m && 0 <= y && y < n;
    }
}
