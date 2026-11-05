# 73. Set Matrix Zeroes

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/set-matrix-zeroes/
**Tags:** Array, Hash Table, Matrix

## Approach 1 — 2026-04-27 17:57 (java)

*Runtime: 3 ms (faster than 17.4%) · Memory: 47.7 MB*

```java
class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    col.add(j);
                    row.add(i);
                    // break;
                }
            }
        }
        for(int x:row){
            for(int i=0;i<matrix[0].length;i++){
                matrix[x][i]=0;
            }
        }
        for(int x:col){
            for(int i=0;i<matrix.length;i++){
                matrix[i][x]=0;
            }
        }
    }
}
```
