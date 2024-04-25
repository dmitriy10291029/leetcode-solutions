package leetcode;

// https://leetcode.com/problems/daily-temperatures/

import java.util.Stack;

public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        int[] stack = new int[temperatures.length];
        int head = -1;

        for (int i = 0; i < temperatures.length; i++) {
            while (head >= 0 && temperatures[i] > temperatures[stack[head]]) {
                res[stack[head]] = i - stack[head];
                head--;
            }
            stack[++head] = i;
        }

        return res;
    }
}
