package leetcode;

// https://leetcode.com/problems/valid-palindrome/

public class Solution125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch) || Character.isAlphabetic(ch)) {
                sb.append(ch);
            }
        }
        char[] chars = sb.toString().toLowerCase().toCharArray();
        for (int i = 0, j = chars.length - 1; i < chars.length / 2; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}
