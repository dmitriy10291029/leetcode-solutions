package leetcode;

// https://leetcode.com/problems/valid-sudoku/

public class Solution036 {
    public boolean isValidSudoku(char[][] board) {
        boolean[] count;
        for (int i = 0; i < 9; i++) {
            count = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (count[board[i][j] - '1']) {
                        return false;
                    } else {
                        count[board[i][j] - '1'] = true;
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            count = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (count[board[j][i] - '1']) {
                        return false;
                    } else {
                        count[board[j][i] - '1'] = true;
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                count = new boolean[9];
                for (int k = i * 3; k < i * 3 + 3; k++) {
                    for (int t = j * 3; t < j * 3 + 3; t++) {
                        if (board[k][t] != '.') {
                            if (count[board[k][t] - '1']) {
                                return false;
                            } else {
                                count[board[k][t] - '1'] = true;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
