package leetcode;

// https://leetcode.com/problems/ransom-note/

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] balance = new int['z' - 'a' + 1];
        for (char ch : magazine.toCharArray()) {
            ++balance[ch - 'a'];
        }
        for (char ch : ransomNote.toCharArray()) {
            --balance[ch - 'a'];
            if (balance[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
