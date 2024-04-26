package leetcode;

// https://leetcode.com/problems/time-based-key-value-store/description/

import java.util.ArrayList;
import java.util.HashMap;

public class Solution981 {
    public static class TimeMap {
        static class Node {
            public String value;
            public int timestamp;

            public Node(String value, int timestamp) {
                this.value = value;
                this.timestamp = timestamp;
            }
        }

        final HashMap<String, ArrayList<Node>> map = new HashMap<>();

        public TimeMap() { }

        public void set(String key, String value, int timestamp) {
            var list = map.get(key);
            if (list != null) {
                list.add(new Node(value, timestamp));
            } else {
                list = new ArrayList<>();
                list.add(new Node(value, timestamp));
                map.put(key, list);
            }
        }

        public String get(String key, int timestamp) {
            var list = map.get(key);
            if (list == null || timestamp < list.get(0).timestamp) {
                return "";
            }
            int l = -1;
            int r = list.size();
            while (l < r - 1) {
                int m = (l + r) / 2;
                if (list.get(m).timestamp <= timestamp) {
                    l = m;
                } else {
                    r = m;
                }
            }
            return list.get(l).value;
        }
    }
}
