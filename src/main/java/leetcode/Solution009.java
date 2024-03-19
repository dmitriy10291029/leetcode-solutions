package leetcode;

public class Solution009 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }

        final int dividerMax = 1_000_000_000;
        int leftDivider = 1;
        while (x / leftDivider >= 10 && leftDivider < dividerMax) {
            leftDivider *= 10;
        }

        int rightDivider = 10;
        int trim = 1;
        int leftDigit, rightDigit;
        do {
            leftDigit = (x / leftDivider) % 10;
            rightDigit = (x % rightDivider) / trim;
            if (leftDigit != rightDigit) {
                return false;
            }
            leftDivider /= 10;
            rightDivider *= 10;
            trim *= 10;
        } while (leftDivider >= rightDivider);

        return true;
    }
}
