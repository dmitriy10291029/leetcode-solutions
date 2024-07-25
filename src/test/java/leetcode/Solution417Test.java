package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution417Test {
    Solution417 s = new Solution417();

    @Test
    void Test1() {
        assertTrue(check(new int[][] {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}},
                         new int[][] {{0,4},{1,3},{1,4},{2,2},{3,0},{3,1},{4,0}}));
    }

    @Test
    void Test2() {
        assertTrue(check(new int[][] {
                        {1,1},
                        {1,1},
                        {1,1}
                },
                new int[][] {{0,0},{0,1},{1,0},{1,1},{2,0},{2,1}}));
    }

    @Test
    void Test3() {
        assertTrue(check(new int[][] {
                        {1,2,3},
                        {8,9,4},
                        {7,6,5}
                },
                new int[][] {{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}}));
    }

    boolean check(int[][] input, int[][] output) {
        var a = s.pacificAtlantic(input);
        if (a.size() != output.length) {
            return false;
        }

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).get(0) != output[i][0] || a.get(i).get(1) != output[i][1]) {
                System.out.println(a);
                return false;
            }
        }
        return true;
    }
}