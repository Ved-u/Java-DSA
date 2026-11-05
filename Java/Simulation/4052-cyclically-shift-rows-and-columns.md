# 4052. Cyclically Shift Rows and Columns

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/cyclically-shift-rows-and-columns/
**Tags:** Array, Matrix, Simulation

## Approach 1 — 2026-09-15 18:50 (java)

*Runtime: 1 ms · Memory: 47.5 MB*

```java
class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] r, int[] c) {
        for(int i=0;i<r.length;i++){
            int x = r[i]%n;
            for(int j=1;j<=x;j++){
                int temp = grid[i][0];
                for(int k=0;k<n-1;k++){
                    grid[i][k] = grid[i][k+1];
                }
                grid[i][n-1] = temp;
            }
        }
        for(int i=0;i<c.length;i++){
            int x = c[i]%n;
            for(int j=1;j<=x;j++){
                int temp = grid[0][i];
                for(int k=0;k<n-1;k++){
                    grid[k][i] = grid[k+1][i];
                }
                grid[n-1][i] = temp;
            }
        }
        return grid;
    }
}
```
