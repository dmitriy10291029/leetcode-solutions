package leetcode;

public class Solution130 {
    public void solve(char[][] board) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == 'O' && !visited[row][col] && isSurroundedDfs(row, col, board, visited)) {
                    fillDfs(row, col, board);
                }
            }
        }
    }

    private boolean isSurroundedDfs(int row, int col, char[][] board, boolean[][] visited) {
        if (isInBorders(row, col, board) && board[row][col] == 'O' && !visited[row][col]) {
            visited[row][col] = true;
            boolean ans = !isOnBorder(row, col, board);
            ans = isSurroundedDfs(row + 1, col, board, visited) && ans;
            ans = isSurroundedDfs(row - 1, col, board, visited) && ans;
            ans = isSurroundedDfs(row, col + 1, board, visited) && ans;
            ans = isSurroundedDfs(row, col - 1, board, visited) && ans;
            return ans;
        }

        return true;
    }

    private void fillDfs(int row, int col, char[][] board) {
        if (isInBorders(row, col, board) && board[row][col] == 'O') {
            board[row][col] = 'X';
            fillDfs(row + 1, col, board);
            fillDfs(row - 1, col, board);
            fillDfs(row, col + 1, board);
            fillDfs(row, col - 1, board);
        }
    }

    private boolean isInBorders(int row, int col, char[][] board) {
        return 0 <= row && row < board.length &&
                0 <= col && col < board[0].length;
    }

    private boolean isOnBorder(int row, int col, char[][] board) {
        return 0 == row || row == board.length - 1 ||
                0 == col || col == board[0].length - 1;
    }
}
//        ["O","O","O","O","X","X"], ....XX
//        ["O","O","O","O","O","O"], ......
//        ["O","X","O","X","O","O"], .X.X..
//        ["O","X","O","O","X","O"], .X..X.
//        ["O","X","O","X","O","O"], .X.X..
//        ["O","X","O","O","O","O"]] .X....