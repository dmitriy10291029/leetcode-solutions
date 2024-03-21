package leetcode;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // find max, given candies.length > 2
        int max = candies[0];
        for (int kid : candies) {
            if (kid > max) {
                max = kid;
            }
        }

        List<Boolean> answer = new ArrayList<>();
        for (int kid : candies) {
            answer.add(kid + extraCandies >= max);
        }

        return answer;
    }
}