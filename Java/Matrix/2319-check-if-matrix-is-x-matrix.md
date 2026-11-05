# 2319. Check if Matrix Is X-Matrix

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-matrix-is-x-matrix/
**Tags:** Array, Matrix

## Approach 1 — 2024-08-15 22:30 (java)

*Runtime: 2 ms (faster than 99.4%) · Memory: 45.3 MB*

```java
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                 if ((i == j || i + j == grid.length - 1)) {
                    if (grid[i][j] == 0) return false;
                } else if (grid[i][j] != 0) return false;
                
            }
        }
       return true; 
    }
}
```

## Approach 2 — 2024-08-15 22:34 (java)

*Runtime: 2 ms (faster than 99.4%) · Memory: 44.9 MB*

```java
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(i==j||i+j==grid.length-1){
                    if (grid[i][j]==0)return false;
                }else if(grid[i][j]!=0)return false;
            }
        }
       return true; 
    }
}
```
