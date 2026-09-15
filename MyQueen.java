import java.util.*;
public class MyQueen {
    static int N;
    static void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Optimized isSafe function
    // Checks if placing a queen on board[row][col] is safe
    static boolean isSafe(int row, int col, boolean[] rows, boolean[] leftDiagonals, boolean[] rightDiagonals) {
        if (rows[row] || leftDiagonals[row + col] || rightDiagonals[col - row + N - 1]) {
            return false;
        }
        return true;
    }
    // Recursive function to solve N-Queen problem
    static boolean solve(int[][] board, int col, boolean[] rows, boolean[] leftDiagonals, boolean[] rightDiagonals) {
        // Base Case: If all queens are placed
        if (col >= N) {
            return true;
        }
        // Consider this column and try placing queens in all rows one by one
        for (int i = 0; i < N; i++) {
            if (isSafe(i, col, rows, leftDiagonals, rightDiagonals)) {
                // Place this queen in board[i][col]
                rows[i] = true;
                leftDiagonals[i + col] = true;
                rightDiagonals[col - i + N - 1] = true;
                board[i][col] = 1;
                // Recur to place the rest of the queens
                if (solve(board, col + 1, rows, leftDiagonals, rightDiagonals)) {
                    return true;
                }
                // Backtracking
                rows[i] = false;
                leftDiagonals[i + col] = false;
                rightDiagonals[col - i + N - 1] = false;
                board[i][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the square board: ");
        N = sc.nextInt();
        // Board of size N x N
        int[][] board = new int[N][N];
        // Arrays to track which rows and diagonals are occupied
        boolean[] rows = new boolean[N];
        boolean[] leftDiagonals = new boolean[2 * N - 1];
        boolean[] rightDiagonals = new boolean[2 * N - 1];
        // Solve the N-Queens problem
        boolean ans = solve(board, 0, rows, leftDiagonals, rightDiagonals);
        if (ans) {
            // Print the solution board
            printSolution(board);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}