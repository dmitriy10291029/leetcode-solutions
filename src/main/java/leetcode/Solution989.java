package leetcode;

// https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.util.LinkedList;
import java.util.List;

public class Solution989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> answer = new LinkedList<>();
        int extra = 0;
        for (int i = num.length - 1; i >= 0 || k > 0; i--) {
            int sum = extra + (k % 10);
            if (i >= 0) {
                sum += num[i];
            }
            k /= 10;
            extra = sum / 10;
            answer.add(0, sum % 10);
        }
        if (extra != 0) {
            answer.add(0, extra);
        }

        return answer;
    }
}