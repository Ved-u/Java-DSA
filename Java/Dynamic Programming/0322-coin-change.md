# 322. Coin Change

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/coin-change/
**Tags:** Array, Dynamic Programming, Breadth-First Search, Knapsack Problem, Complete Knapsack

## Approach 1 — 2024-12-27 20:55 (java)

*Runtime: 11 ms (faster than 98.3%) · Memory: 44.3 MB*

```java
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 0; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE - 1;
        }
        dp[0] = 0;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] = Math.min(dp[j], 1 + dp[j - coin]);
            }
        }
    return dp[amount] == Integer.MAX_VALUE - 1 ? -1 : dp[amount];
    }
}
```
