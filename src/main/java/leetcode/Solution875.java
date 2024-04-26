package leetcode;

// https://leetcode.com/problems/koko-eating-bananas/description/

import java.util.Arrays;

public class Solution875 {
    public int minEatingSpeed(int[] piles, int h) {
        var stat = Arrays.stream(piles).summaryStatistics();
        int l = 0;
        int r = stat.getMax();
        while (l < r - 1) {
            int m = l + (r - l) / 2;

            long requiredHours = 0;
            for (int pile : piles) {
                requiredHours += (pile - 1) / m + 1;
            }
            System.out.println(m + " " + (requiredHours - h));

            if (requiredHours <= h) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }
}
