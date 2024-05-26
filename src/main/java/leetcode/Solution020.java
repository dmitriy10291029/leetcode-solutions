package leetcode;

// https://leetcode.com/problems/valid-parentheses/description/

import java.util.ArrayDeque;

public class Solution020 {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                char head;
                if (stack.size() == 0) {
                    return false;
                } else {
                    head = stack.pop();
                }
                if (ch == ')' && head != '('
                        || ch == ']' && head != '['
                        || ch == '}' && head != '{') {
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }
}
