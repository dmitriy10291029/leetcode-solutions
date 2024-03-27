package leetcode;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashMap;

public class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> usedIndex = new HashMap<>();
        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (usedIndex.containsKey(ch) && usedIndex.get(ch) >= start) {
                maxLen = Math.max(maxLen, i - start);
                start = usedIndex.get(ch) + 1;
            }
            usedIndex.put(ch, i);
        }

        return Math.max(maxLen, s.length() - start);
    }
}
