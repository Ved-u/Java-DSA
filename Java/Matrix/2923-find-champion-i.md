# 2923. Find Champion I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-champion-i/
**Tags:** Array, Matrix

## Approach 1 — 2024-03-21 18:42 (java)

*Runtime: 1 ms (faster than 87.7%) · Memory: 45 MB*

```java
class Solution {
    public int findChampion(int[][] grid) {
    int countWinning[]=new int[grid.length];
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1)countWinning[i]++;
        }
    }
    for(int i=0;i<countWinning.length;i++){
        if(countWinning[i]==grid.length-1)return i;
    }
    return 69; 
    }
}
```
