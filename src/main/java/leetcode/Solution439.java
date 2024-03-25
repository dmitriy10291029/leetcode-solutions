package leetcode;

// https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution439 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1)
            set1.add(i);

        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2)
            set2.add(i);

        int[] intersect = new int[1000];
        int j = 0;
        for (Integer i : set1) {
            if (set2.contains(i)) {
                intersect[j++] = i;
            }
        }

        return Arrays.copyOf(intersect, j);
    }
}
