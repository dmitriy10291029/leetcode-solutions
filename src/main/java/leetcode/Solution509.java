package leetcode;

// https://leetcode.com/problems/fibonacci-number/

public class Solution509 {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < n; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }

        return array[n - 1] + array[n - 2];
    }
}
