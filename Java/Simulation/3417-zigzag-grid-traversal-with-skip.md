# 3417. Zigzag Grid Traversal With Skip

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/zigzag-grid-traversal-with-skip/
**Tags:** Array, Matrix, Simulation

## Approach 1 — 2025-01-12 08:41 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 45.6 MB*

```java
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        boolean right=true,last=false;
        for (int i = 0; i < m; i++) {
            if (right) {
                for (int j = 0; j < n; j += 2) {
                    if(j==n-1)last=true;
                    result.add(grid[i][j]);
                }
            }
            else {
                if(last){
                for (int j = n - 2; j >= 0; j -= 2) {
                    result.add(grid[i][j]);
                }}else{
                    for (int j = n - 1; j >= 0; j -= 2) {
                    result.add(grid[i][j]);
                }
                }
            }
            right=!right;
        }
    return result;
    }
}
```
