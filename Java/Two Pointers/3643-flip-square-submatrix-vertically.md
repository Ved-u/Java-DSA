# 3643. Flip Square Submatrix Vertically

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/flip-square-submatrix-vertically/
**Tags:** Array, Two Pointers, Matrix

## Approach 1 — 2026-03-21 18:55 (java)

*Runtime: 1 ms (faster than 77.8%) · Memory: 47.4 MB*

```java
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int ptrX = x+k-1;
        int ptrY = y;
        while(x<ptrX){
            for(int i=y;i<y+k;i++){
                grid[x][i]=grid[x][i]^grid[ptrX][i];
                grid[ptrX][i]=grid[x][i]^grid[ptrX][i];
                grid[x][i]=grid[x][i]^grid[ptrX][i];
            }
            x++;ptrX--;
        }
        return grid;
    }
}
```
