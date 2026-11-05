# 37. Sudoku Solver

**Difficulty:** Hard
**Link:** https://leetcode.com/problems/sudoku-solver/
**Tags:** Array, Hash Table, Backtracking, Matrix, Algorithm X, Dancing Links

## Approach 1 — 2024-11-22 12:46 (java)

*Runtime: 155 ms (faster than 89.1%) · Memory: 40.9 MB*

```java
class Solution {
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    private boolean helper(char[][] board, int cr, int cc) {
        int n = board.length;

        // Base case: If we've processed all rows, the board is solved
        if (cr == n) {
            return true;
        }

        // Move to the next row if we are at the end of the current row
        if (cc == n) {
            return helper(board, cr + 1, 0);
        }

        // Skip already filled cells
        if (board[cr][cc] != '.') {
            return helper(board, cr, cc + 1);
        }

        // Try placing digits 1-9 in the current cell
        for (char ch = '1'; ch <= '9'; ch++) {
            if (isValid(board, cr, cc, ch)) {
                board[cr][cc] = ch; // Place the digit
                if (helper(board, cr, cc + 1)) {
                    return true; // If the board is solved, return true
                }
                board[cr][cc] = '.'; // Backtrack
            }
        }

        return false; // No solution found for this path
    }

    private boolean isValid(char[][] board, int row, int col, char num) {
        // Check the row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Check the 3x3 sub-grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
```

## Approach 2 — 2025-01-18 20:55 (java)

*Runtime: 155 ms (faster than 89.1%) · Memory: 41.5 MB*

```java
class Solution {
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    private boolean helper(char[][] board, int cr, int cc) {
        int n = board.length;
        if (cr == n) {
            return true;
        }

        // Move to the next row if we are at the end of the current row
        if (cc == n) {
            return helper(board, cr + 1, 0);
        }

        // Skip already filled cells
        if (board[cr][cc] != '.') {
            return helper(board, cr, cc + 1);
        }

        // Try placing digits 1-9 in the current cell
        for (char ch = '1'; ch <= '9'; ch++) {
            if (isValid(board, cr, cc, ch)) {
                board[cr][cc] = ch; // Place the digit
                if (helper(board, cr, cc + 1)) {
                    return true; // If the board is solved, return true
                }
                board[cr][cc] = '.'; // Backtrack
            }
        }

        return false; // No solution found for this path
    }

    private boolean isValid(char[][] board, int row, int col, char num) {
        // Check the row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Check the 3x3 sub-grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
```
