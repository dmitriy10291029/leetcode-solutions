package leetcode;

// https://leetcode.com/problems/check-if-n-and-its-double-exist/submissions/1213875742/

import java.util.HashSet;

public class Solution1346 {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
