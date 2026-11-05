# 2500. Delete Greatest Value in Each Row

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/delete-greatest-value-in-each-row/
**Tags:** Array, Sorting, Heap (Priority Queue), Matrix, Simulation

## Approach 1 — 2024-08-12 16:13 (java)

*Runtime: 2 ms (faster than 100.0%) · Memory: 44.8 MB*

```java
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans=0;
        for(int x[]:grid)
            Arrays.sort(x);
        int right=grid[0].length-1;
        while(right>=0){
            ans+=max(grid,right);
            right--;
        }
    return ans;    
    }
    public int max(int [][]grid,int j){
        int ans=0;
        for(int i=0;i<grid.length;i++){
            ans=Math.max(ans,grid[i][j]);
        }
    return ans;    
    }
}
```
