# 3402. Minimum Operations to Make Columns Strictly Increasing

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-operations-to-make-columns-strictly-increasing/
**Tags:** Array, Greedy, Matrix

## Approach 1 — 2025-01-19 09:07 (java)

*Runtime: 3 ms (faster than 5.1%) · Memory: 45.5 MB*

```java
class Solution {
    public int minimumOperations(int[][] grid) {
        int ans=0;
        for(int j=0;j<grid[0].length;j++){
            for(int i=1;i<grid.length;i++){
                while(grid[i][j]<=grid[i-1][j]){
                    ans++;
                    grid[i][j]++;
                }
            }
        }
    return ans;
    }
}
```
