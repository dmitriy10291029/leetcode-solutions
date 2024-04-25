package leetcode;

import java.util.Arrays;

public class Solution155 {
    public static class MinStack {
        int[] store;
        int[] minimums;
        int size;

        public MinStack() {
            store = new int[32];
            minimums = new int[32];
            size = 0;
        }

        public void push(int val) {
            if (size == store.length) {
                store = Arrays.copyOf(store, store.length * 2);
                minimums = Arrays.copyOf(minimums, minimums.length * 2);
            }
            store[size] = val;
            minimums[size] = size == 0 ? val : Math.min(val, minimums[size - 1]);
            size++;
        }

        public void pop() {
            if (size > 0) {
                size--;
            }
        }

        public int top() {
            return store[size - 1];
        }

        public int getMin() {
            return minimums[size - 1];
        }
    }
}
