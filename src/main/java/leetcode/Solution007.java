package leetcode;

// https://leetcode.com/problems/reverse-integer/description/

public class Solution007 {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x *= -1;
        }
        int y = 0;
        int lastValue = 0;
        while (x > 0) {
            y *= 10;
            y += x % 10;
            if (y / 10 < lastValue) {
                return 0;
            }
            lastValue = y;
            x /= 10;
        }

        return y * sign;
    }
}
