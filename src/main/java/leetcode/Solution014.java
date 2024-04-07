package leetcode;

// https://leetcode.com/problems/longest-common-prefix/submissions/1225677757/

public class Solution014 {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            for (String str : strs) {
                if (str.length() <= i || str.charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
