package leetcode;

// https://leetcode.com/problems/merge-intervals/description/

import java.util.Arrays;

public class Solution056 {
    static public class Intervals {
        private int[][] array;
        private int size;

        public Intervals() {
            array = new int[8][2];
            size = 0;
        }

        public void add(int a, int b) {
            if (array.length <= size) {
                array = Arrays.copyOf(array, array.length * 2);
            }
            array[size++] = new int[]{a, b};
        }

        public int[][] toArray() {
            return Arrays.copyOf(array, size);
        }
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        Intervals answer = new Intervals();

        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                // if inervals interserct, update end
                end = Math.max(intervals[i][1], end);
            } else {
                // else add last pair and update start, end
                answer.add(start, end);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        answer.add(start, end);

        return answer.toArray();
    }
}
