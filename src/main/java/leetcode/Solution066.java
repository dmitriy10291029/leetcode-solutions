package leetcode;

// https://leetcode.com/problems/plus-one/description/

public class Solution066 {
    public int[] plusOne(int[] digits) {
        int[] answer = new int[digits.length];
        int extra = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + extra;
            extra = sum / 10;
            answer[i] = sum % 10;
        }
        if (extra == 0) {
            return answer;
        }
        int[] fullAnswer = new int[digits.length + 1];
        fullAnswer[0] = extra;
        System.arraycopy(answer, 0, fullAnswer, 1, digits.length);
        return fullAnswer;
    }
}