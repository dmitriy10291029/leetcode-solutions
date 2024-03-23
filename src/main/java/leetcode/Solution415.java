package leetcode;

// https://leetcode.com/problems/add-strings/description/

public class Solution415 {
    public int getDigit(String str, int i) {
        if (i >= str.length()) {
            return 0;
        }
        return str.charAt(str.length() - 1 - i) - '0';
    }

    public String addStrings(String num1, String num2) {
        StringBuilder answer = new StringBuilder();
        int digitsSum = 0;

        for (int i = 0; i < num1.length() || i < num2.length(); i++) {
            digitsSum += getDigit(num1, i) + getDigit(num2, i);
            answer.append(digitsSum % 10);
            digitsSum /= 10;
        }

        if (digitsSum != 0) {
            answer.append(digitsSum);
        }

        return answer.reverse().toString();
    }
}
