package leetcode;

// https://leetcode.com/problems/longest-repeating-character-replacement/description/

public class Solution424 {
    public int characterReplacement(String s, int k) {
        int[] amountOfLetter = new int[26];
        int ans = 0;
        int maxFreq = 0;
        int left = 0;

        char[] charArray = s.toCharArray();
        for (int right = 0; right < s.length(); right++) {
            maxFreq = Math.max(maxFreq, ++amountOfLetter[charArray[right] - 'A']);
            if (maxFreq + k < right - left + 1) {
                amountOfLetter[charArray[left] - 'A']--;
                left++;
            } else {
                ans = Math.max(ans, right - left + 1);
            }
        }

        return ans;
    }
}
