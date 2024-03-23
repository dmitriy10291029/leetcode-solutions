package leetcode;

public class Solution258 {
    static public int addDigits(int nums) {
        if (nums / 10 == 0) {
            return nums;
        }

        return nums % 9 == 0 ? 9 : nums % 9;
    }

    static public int addDigitsNative(int nums) {
        if (nums / 10 == 0) {
            return nums;
        }
        String str = String.valueOf(nums);
        int sumDigits = 0;
        for (int i = 0; i < str.length(); ++i) {
            sumDigits += str.charAt(i) - '0';
        }
        return addDigits(sumDigits);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            System.out.print(addDigitsNative(i));
            System.out.print(" ");
            System.out.println(addDigits(i));
        }
    }
}
