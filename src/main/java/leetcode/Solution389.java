package leetcode;

// https://leetcode.com/problems/find-the-difference/submissions/1213867577/

public class Solution389 {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for (char cs : s.toCharArray()) {
            ans ^= cs;
        }
        for (char ct : t.toCharArray()) {
            ans ^= ct;
        }
        return ans;
    }
}
