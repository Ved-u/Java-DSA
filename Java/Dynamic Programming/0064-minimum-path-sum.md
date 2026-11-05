# 64. Minimum Path Sum

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-path-sum/
**Tags:** Array, Dynamic Programming, Matrix

## Approach 1 — 2025-01-06 20:16 (java)

*Runtime: 5 ms (faster than 23.0%) · Memory: 47.8 MB*

```java
class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0&&j==0){
                    dp[i][j]=grid[0][0];
                    continue;
                }
                int D=(i>0)?dp[i-1][j]:Integer.MAX_VALUE;
                int R=(j>0)?dp[i][j-1]:Integer.MAX_VALUE;
                dp[i][j]=grid[i][j]+Math.min(D,R);
            }
        }
    return dp[grid.length-1][grid[0].length-1];
    }
}
```
