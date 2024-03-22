package leetcode;

// https://leetcode.com/problems/summary-ranges/description/

import java.util.ArrayList;
import java.util.List;

public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        if (nums.length > 0) {
            int startValue = nums[0];
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < nums.length; ++i) {
                if (i == nums.length - 1 || nums[i] != nums[i - 1] + 1) {
                    if (startValue == nums[i - 1]) {
                        answer.add(String.valueOf(startValue));
                    } else {
                        sb.append(startValue).append("->").append(nums[i - 1]);
                        answer.add(sb.toString());
                    }
                    sb.setLength(0);
                    startValue = nums[i];
                }
            }

            int last = nums.length - 1;
            if (startValue == nums[last]) {
                answer.add(String.valueOf(startValue));
            } else {
                sb.append(startValue).append("->").append(nums[last]);
                answer.add(sb.toString());
            }
        }
        return answer;
    }
}