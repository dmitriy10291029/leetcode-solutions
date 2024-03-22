package leetcode;

public class Solution941 {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 2) {
            return false;
        }

        // going up
        int i = 1;
        while (arr[i - 1] < arr[i]) {
            if (++i == arr.length) {
                return false;
            }
        }

        // going up step more than 1
        if (i == 1) {
            return false;
        }

        //going down
        while (arr[i - 1] > arr[i]) {
            if (++i == arr.length) {
                return true;
            }
        }

        return false;
    }
}