# 1547. Minimum Cost to Cut a Stick

**Difficulty:** Hard
**Link:** https://leetcode.com/problems/minimum-cost-to-cut-a-stick/
**Tags:** Array, Dynamic Programming, Sorting

## Approach 1 — 2025-01-06 16:38 (java)

*Runtime: 12 ms (faster than 98.8%) · Memory: 42.7 MB*

```java
class Solution {
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int[] arr = new int[m + 2];
        arr[0] = 0; 
        arr[m + 1] = n;
        System.arraycopy(cuts, 0, arr, 1, m);
        Arrays.sort(arr);
        int[][] dp = new int[m + 2][m + 2];
        for (int len = 2; len <= m + 1; len++) {
            for (int i = 0; i <= m + 1 - len; i++) {
                int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] + arr[j] - arr[i]);
                }
            }
        }
    return dp[0][m + 1];
    }
}
```
