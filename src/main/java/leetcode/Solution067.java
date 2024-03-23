package leetcode;

// https://leetcode.com/problems/add-binary/

public class Solution067 {
    int getBit(String num, int digit) {
        if (digit >= num.length()) {
            return 0;
        } else {
            return num.charAt(num.length() - digit - 1) - '0';
        }
    }

    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int digit = 0;
        int extra = 0;

        while (digit < a.length() || digit < b.length()) {
            int bitSum = extra + getBit(a, digit) + getBit(b, digit);
            extra = bitSum / 2;
            sum.append(bitSum % 2);
            digit++;
        }
        if (extra != 0) {
            sum.append(extra);
        }
        return sum.reverse().toString();
    }
}
