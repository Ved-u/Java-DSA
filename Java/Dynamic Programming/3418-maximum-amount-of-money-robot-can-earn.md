# 3418. Maximum Amount of Money Robot Can Earn

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/maximum-amount-of-money-robot-can-earn/
**Tags:** Array, Dynamic Programming, Matrix

## Approach 1 — 2025-01-12 08:13 (java)

*Runtime: 103 ms (faster than 52.3%) · Memory: 82 MB*

```java
class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;

        // DP array: dp[i][j][k] -> maximum coins at (i, j) with k neutralizations used
        int[][][] dp = new int[m][n][3];

        // Initialize DP array with a very small value (negative infinity)
        for (int[][] layer : dp) {
            for (int[] row : layer) {
                Arrays.fill(row, Integer.MIN_VALUE);
            }
        }

        // Base case: starting cell
        dp[0][0][0] = coins[0][0];
        if (coins[0][0] < 0) {
            dp[0][0][1] = 0; // Neutralize if starting cell has a robber
        }

        // Fill the DP table
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) { // k is the number of neutralizations used so far
                    if (dp[i][j][k] == Integer.MIN_VALUE) continue;

                    // Move Down
                    if (i + 1 < m) {
                        int nextVal = coins[i + 1][j];
                        // If it's a robber and we can neutralize
                        if (nextVal < 0 && k + 1 < 3) {
                            dp[i + 1][j][k + 1] = Math.max(dp[i + 1][j][k + 1], dp[i][j][k]);
                        }
                        // Otherwise, take the value as it is
                        dp[i + 1][j][k] = Math.max(dp[i + 1][j][k], dp[i][j][k] + nextVal);
                    }

                    // Move Right
                    if (j + 1 < n) {
                        int nextVal = coins[i][j + 1];
                        // If it's a robber and we can neutralize
                        if (nextVal < 0 && k + 1 < 3) {
                            dp[i][j + 1][k + 1] = Math.max(dp[i][j + 1][k + 1], dp[i][j][k]);
                        }
                        // Otherwise, take the value as it is
                        dp[i][j + 1][k] = Math.max(dp[i][j + 1][k], dp[i][j][k] + nextVal);
                    }
                }
            }
        }

        // Get the maximum value at the bottom-right corner
        int maxProfit = Integer.MIN_VALUE;
        for (int k = 0; k < 3; k++) {
            maxProfit = Math.max(maxProfit, dp[m - 1][n - 1][k]);
        }

        return maxProfit;
    }
}
```
