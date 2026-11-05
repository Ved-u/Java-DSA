# 2373. Largest Local Values in a Matrix

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/largest-local-values-in-a-matrix/
**Tags:** Array, Matrix

## Approach 1 — 2024-05-14 13:41 (java)

*Runtime: 3 ms (faster than 81.4%) · Memory: 45.9 MB*

```java
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int ans[][]=new int[grid.length-2][grid.length-2];
        int max=-1;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                for(int k=i;k<=i+2;k++){
                    for(int l=j;l<=j+2;l++){
                        max=Math.max(max,grid[k][l]);
                    }
                }
                ans[i][j]=max;
                max=-1;
            }
        }
    return ans;    
    }
}
```
