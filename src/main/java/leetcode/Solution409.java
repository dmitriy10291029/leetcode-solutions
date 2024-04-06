package leetcode;

// https://leetcode.com/problems/longest-palindrome/description/

public class Solution409 {
    public int longestPalindrome(String s) {
        int[] count = new int['z' - 'A' + 1];
        int ans = 0;

        for (char ch : s.toCharArray()) {
            if (++count[ch - 'A'] % 2 == 0) {
                ans += 2;
            }
        }

        boolean hasOneOdd = false;
        for (int i : count) {
            if (i % 2 == 1) {
                hasOneOdd = true;
                break;
            }
        }

        return hasOneOdd ? ans + 1 : ans;
    }
}
