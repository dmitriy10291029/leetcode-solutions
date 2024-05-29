package leetcode;

// https://leetcode.com/problems/happy-number/

import java.util.HashSet;

public class Solution202 {
    private final HashSet<Integer> map = new HashSet<>();

    public boolean isHappy(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        if (sum == 1) {
            return true;
        }
        if (map.contains(sum)) {
            return false;
        }
        map.add(sum);
        return isHappy(sum);
    }
}
