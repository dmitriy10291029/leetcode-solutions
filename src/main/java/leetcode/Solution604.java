package leetcode;

// https://leetcode.com/problems/can-place-flowers/description/

import java.util.Arrays;

public class Solution604 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // unique case
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0) {
                flowerbed[0] = 1;
                n--;
            }
            return n <= 0;
        }

        // first elements has not left neighbour
        if (flowerbed[0] + flowerbed[1] == 0) {
            flowerbed[0] = 1;
            if (--n <= 0) {
                return true;
            }
        }

        for (int i = 1; i <= flowerbed.length - 2; i++) {
            if (flowerbed[i - 1] + flowerbed[i] + flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                if (--n <= 0) {
                    return true;
                }
            }
        }

        // last element has not right neighbour
        int i = flowerbed.length - 1;
        if (flowerbed[i - 1] + flowerbed[i] == 0) {
            flowerbed[i] = 1;
            n--;
        }

        return n <= 0;
    }
}
