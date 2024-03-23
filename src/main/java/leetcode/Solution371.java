package leetcode;

// https://leetcode.com/problems/sum-of-two-integers/

public class Solution371 {
    public int getSum(int a, int b) {
        return Integer.sum(a, b);

//        Iterative solution
//        if (a == 0) return b;
//        if (b == 0) return a;
//
//        while (b != 0) {
//            int carry = a & b;
//            a = a ^ b;
//            b = carry << 1;
//        }
//
//        return a;
    }
}
