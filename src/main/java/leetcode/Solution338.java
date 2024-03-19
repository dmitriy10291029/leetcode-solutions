package leetcode;

// https://leetcode.com/problems/counting-bits/description/

import java.util.Arrays;

public class Solution338 {
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        int maxDegree = 16;
        for (int i = 0; i <= n; ++i) {
            int factor = 1;
            int sumOfOnes = 0;
            for (int j = 1; j <= maxDegree; ++j) {
                if ((i & factor) > 0) {
                    sumOfOnes++;
                }
                factor <<= 1;
            }
            answer[i] = sumOfOnes;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution338 s = new Solution338();
        System.out.println(Arrays.toString(s.countBits(15)));
    }
}
