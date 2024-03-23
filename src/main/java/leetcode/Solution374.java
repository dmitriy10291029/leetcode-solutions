package leetcode;

// https://leetcode.com/problems/guess-number-higher-or-lower/submissions/1211612794/

public class Solution374 {
    public int pick;

    int guess(int num) {
        return Integer.compare(pick, num);
    }

    public int guessNumber(int n) {
        int l = 1;
        int r = n;

        while (l <= r) {
            // l + r > 2^31 - 1
            int m = (int) (((long) l + r) / 2);
            int g = guess(m);
            if (g == 0) {
                return m;
            } else if (g < 0) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return l;
    }
}
