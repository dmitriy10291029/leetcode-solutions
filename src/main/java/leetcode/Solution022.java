package leetcode;

// https://leetcode.com/problems/generate-parentheses/description/

import java.util.ArrayList;
import java.util.List;

public class Solution022 {
    public void rec(List<String> list, int left, int right, int n, StringBuilder s) {
        if (left == right && left == n) {
            list.add(s.toString());
            return;
        }
        if (left < n) {
            rec(list, left + 1, right, n, s.append('('));
            s.setLength(s.length() - 1);
        }
        if (left > right) {
            rec(list, left, right + 1, n, s.append(')'));
            s.setLength(s.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        rec(list, 0, 0, n, new StringBuilder());
        return list;
    }
}
