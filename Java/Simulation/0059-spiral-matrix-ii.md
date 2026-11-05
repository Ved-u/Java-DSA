# 59. Spiral Matrix II

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/spiral-matrix-ii/
**Tags:** Array, Matrix, Simulation

## Approach 1 — 2024-08-08 14:14 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int count=1;
        int startRow=0;
        int endCol=matrix[0].length-1;
        int endRow=matrix.length-1;
        int startCol=0;
        while(startCol<=endCol&&startRow<=endRow){
            //top
            for(int j=startCol;j<=endCol;j++){
                matrix[startCol][j]=count++;
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                matrix[i][endCol]=count++;
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow)break;
                matrix[endRow][j]=count++;
            }
            //left
            for(int i=endRow-1;i>startRow;i--){
                if(startCol==endCol)break;
                matrix[i][startCol]=count++;
            }
            //update variables
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    return matrix;
    }
}
```
