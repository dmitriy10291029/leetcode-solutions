package leetcode;

// https://leetcode.com/problems/counting-bits/description/

import java.util.Arrays;

public class Solution338 {
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 0;
        int j = 1;
        int k = 0;

        for (int i = 1; i < n + 1; i++) {
            if (i == j) {
                k = 0;
                j *= 2;
            }
            answer[i] = answer[k] + 1;
            k++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution338 s = new Solution338();
        System.out.println(Arrays.toString(s.countBits(10)));
    }
}
