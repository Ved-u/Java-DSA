# 867. Transpose Matrix

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/transpose-matrix/
**Tags:** Array, Matrix, Simulation

## Approach 1 — 2026-06-23 11:48 (java)

*Runtime: 1 ms (faster than 30.9%) · Memory: 46.7 MB*

```java
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
```
