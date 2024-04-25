package leetcode;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/submissions/1241640566/

import java.util.Stack;

public class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> vars = new Stack<>();
        for (String token : tokens) {
            if ("+".equals(token)) {
                vars.push(vars.pop() + vars.pop());
            } else if ("-".equals(token)) {
                Integer b = vars.pop();
                Integer a = vars.pop();
                vars.push(a - b);
            } else if ("*".equals(token)) {
                vars.push(vars.pop() * vars.pop());
            } else if ("/".equals(token)) {
                Integer b = vars.pop();
                Integer a = vars.pop();
                vars.push(a / b);
            } else {
                vars.push(Integer.valueOf(token));
            }
        }
        return vars.pop();
    }
}
