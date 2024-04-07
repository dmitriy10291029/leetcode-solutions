package leetcode;

// https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

public class Solution020 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                char head;
                if (stack.empty()) {
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

        return stack.empty();
    }
}
