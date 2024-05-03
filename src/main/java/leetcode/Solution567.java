package leetcode;

// https://leetcode.com/problems/permutation-in-string/

import java.util.Arrays;

public class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] dict1 = new int[26];
        int[] dict2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            dict1[s1.charAt(i) - 'a']++;
            dict2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.compare(dict1, dict2) == 0) {
            return true;
        }

        for (int l = 0, r = s1.length(); r < s2.length(); r++, l++) {
            dict2[s2.charAt(l) - 'a']--;
            dict2[s2.charAt(r) - 'a']++;
            if (Arrays.compare(dict1, dict2) == 0) {
                return true;
            }
        }

        return false;
    }
}
