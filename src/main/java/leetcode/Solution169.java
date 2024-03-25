package leetcode;

// https://leetcode.com/problems/majority-element/submissions/1213855059/

import java.util.HashMap;
import java.util.Map;

public class Solution169 {
    // Map Solution
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        final int half = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                int newValue = map.get(num) + 1;
                if (newValue > half) {
                    return num;
                }
                map.replace(num, newValue);
            } else {
                map.put(num, 1);
            }
        }
        return 0;
    }

    // Math Solution
    public int majorityElement2(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
