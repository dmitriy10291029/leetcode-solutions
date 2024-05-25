package leetcode;

// https://leetcode.com/problems/lru-cache/description/

import java.util.HashMap;

public class Solution146 {
    static class LRUCache {
        private static class Node {
            public int key;
            public int value;
            public Node next = null;
            public Node prev = null;

            public Node(int key, int value, Node prev, Node next) {
                this.key = key;
                this.value = value;
                this.next = next;
                this.prev = prev;
            }

            public Node(int key, int value) {
                this.value = value;
                this.key = key;
            }
        }

        private final Node fakeLast = new Node(0, 0);
        private final Node fakeRecent = new Node(0, 0);

        private final HashMap<Integer, Node> storage = new HashMap<>();
        private final int capacity;

        private void add(Node node) {
            Node prev = fakeRecent.prev;

            prev.next = node;
            node.prev = prev;

            node.next = fakeRecent;
            fakeRecent.prev = node;
        }

        private void delete(Node node) {
            if (node.next != null) {
                node.next.prev = node.prev;
            }
            if (node.prev != null) {
                node.prev.next = node.next;
            }
            node.next = null;
            node.prev = null;
        }

        public LRUCache(int capacity) {
            this.capacity = capacity;
            fakeRecent.prev = fakeLast;
            fakeLast.next = fakeRecent;
        }

        public int get(int key) {
            Node node = storage.get(key);
            if (node == null) {
                return -1;
            } else {
                delete(node);
                add(node);

                return node.value;
            }
        }

        public void put(int key, int value) {
            Node node = storage.get(key);
            if (node != null) {
                delete(node);
                add(node);
                node.value = value;

            } else {
                node = new Node(key, value);
                add(node);
                storage.put(key, node);

                if (storage.size() > capacity) {
                    Node last = fakeLast.next;
                    storage.remove(last.key);
                    delete(last);
                }
            }
        }
    }
}
