package leetcode;

// https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/description/

import java.util.*;

public class Solution2115 {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        int n = recipes.length;

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> inDegrees = new HashMap<>();
        for (int i = 0; i < n; i++) {
            inDegrees.put(recipes[i], ingredients.get(i).size());

            for (var j : ingredients.get(i)) {
                List<String> list = graph.computeIfAbsent(j, k -> new ArrayList<>());
                list.add(recipes[i]);
            }
        }

        Deque<String> deque = new ArrayDeque<>();
        for (String sup : supplies) {
            deque.add(sup);
            inDegrees.put(sup, 0);
        }

        List<String> result = new ArrayList<>();

        while (!deque.isEmpty()) {
            String i = deque.pollFirst();
            if (graph.containsKey(i)) {
                for (var j : graph.get(i)) {
                    int newInDegree = inDegrees.get(j) - 1;
                    if (newInDegree == 0) {
                        deque.add(j);
                        result.add(j);
                    }
                    inDegrees.put(j, newInDegree);
                }
            }
        }

        return result;
    }
}
