package leetcode;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1213822599/

import java.util.ArrayList;
import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] counter = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]] = true;
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i < counter.length; ++i) {
            if (!counter[i]) {
                answer.add(i);
            }
        }
        return answer;
    }
}
