package leetcode;

// https://leetcode.com/problems/course-schedule/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution207 {
    private enum Color {
        WHITE, GREY, BLACK
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (var e : prerequisites) {
            graph.get(e[0]).add(e[1]);
        }

        Color[] colors = new Color[numCourses];
        Arrays.fill(colors, Color.WHITE);

        for (int i = 0; i < numCourses; i++) {
            if (colors[i] == Color.WHITE && dfs(graph, i, colors)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(List<List<Integer>> graph, int v, Color[] colors) {
        System.out.println(v + " = grey");
        colors[v] = Color.GREY;

        for (var i : graph.get(v)) {
            if (colors[i] == Color.GREY) {
                System.out.println(i + " == grey, found cycle");
                return true;

            } if (colors[i] == Color.WHITE) {
                if (dfs(graph, i, colors)) {
                    return true;
                }
            }
        }

        colors[v] = Color.BLACK;
        System.out.println(v + " = black");
        return false;
    }
}
