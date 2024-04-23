package leetcode;

// https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashMap;

public class Solution128 {
    public static class Pair {
        public int prev, next;

        public Pair(int prev, int next) {
            this.prev = prev;
            this.next = next;
        }
    }
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Pair> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                Pair prev = map.get(i - 1);
                Pair next = map.get(i + 1);
                Pair curr = null;
                if (prev != null) {
                    prev.next++;
                    curr = prev;
                }
                if (next != null) {
                    if (prev != null) {
                        prev.next = next.next;
                        map.put(i + 1, prev);
                    } else {
                        next.prev--;
                        curr = next;
                    }
                }
                map.put(i, curr == null ? new Pair(i, i) : curr);
            }
        }
        int max = 1;
        for (var e : map.entrySet()) {
            // find start of the chain
            Pair curr = e.getValue();
            int start = e.getKey();
            if (curr.next > start && curr.prev == start) {
                int end = start;
                do {
                    end++;
                    curr = map.get(end);
                } while (curr.next != end);
                max = Math.max(max, end - start + 1);
            }
        }
        return max;
    }
}
