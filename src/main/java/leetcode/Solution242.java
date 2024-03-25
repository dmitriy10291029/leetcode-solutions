package leetcode;

// https://leetcode.com/problems/valid-anagram/submissions/1213806109/

class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] balance = new int['z' + 1];

        for (int i = 0; i < s.length(); ++i) {
            balance[s.charAt(i)]++;
            balance[t.charAt(i)]--;
        }

        for (int i = 'a'; i <= 'z'; ++i) {
            if (balance[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
