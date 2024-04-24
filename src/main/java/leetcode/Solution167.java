package leetcode;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

import java.util.Arrays;

public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }

        return new int[]{l + 1, r + 1};
    }
}
