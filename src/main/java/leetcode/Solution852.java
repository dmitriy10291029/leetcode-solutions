package leetcode;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

import javax.annotation.processing.SupportedSourceVersion;

public class Solution852 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int leftThird;
        int rightThird;

        do {
            leftThird = (2 * left + right) / 3;
            rightThird = (left + 2 * right + 1) / 3;
            System.out.format("%d %d %d %d\n", left, leftThird, rightThird, right);
            if (arr[leftThird] > arr[rightThird]) {
                right = rightThird;
            } else {
                left = leftThird;
            }
        } while (rightThird - leftThird > 1);

        return arr[leftThird] > arr[rightThird] ? leftThird : rightThird;
    }
}