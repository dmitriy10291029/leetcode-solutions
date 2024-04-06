package leetcode;

// https://leetcode.com/problems/isomorphic-strings/submissions/1225140495/

public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        char[] dict = new char[256];
        boolean[] used = new boolean[256];

        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        for (int i = 0; i < sa.length; i++) {
            char c = dict[sa[i]];

            if (c == 0 && !used[ta[i]]) {
                dict[sa[i]] = ta[i];
                used[ta[i]] = true;

            } else if (ta[i] != c) {
                return false;
            }
        }

        return true;
    }
}
