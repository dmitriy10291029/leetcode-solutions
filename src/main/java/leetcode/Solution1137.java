package leetcode;

// https://leetcode.com/problems/n-th-tribonacci-number/description/

public class Solution1137 {
    public int tribonacci(int n) {
        int[] array = new int[n + 3];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;

        for (int i = 3; i <= n; i++) {
            array[i] = array[i - 2] + array[i - 1] + array[i - 3];
        }

        return array[n];
    }
}
