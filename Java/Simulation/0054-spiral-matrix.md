# 54. Spiral Matrix

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/spiral-matrix/
**Tags:** Array, Matrix, Simulation

## Approach 1 — 2024-03-21 17:35 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.6 MB*

```java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int startRow=0;
        int endCol=matrix[0].length-1;
        int endRow=matrix.length-1;
        int startCol=0;
        while(startCol<=endCol&&startRow<=endRow){
            //top
            for(int j=startCol;j<=endCol;j++){
                ans.add(matrix[startCol][j]);
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                ans.add(matrix[i][endCol]);
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow)break;
                ans.add(matrix[endRow][j]);
            }
            //left
            for(int i=endRow-1;i>startRow;i--){
                if(startCol==endCol)break;
                ans.add(matrix[i][startCol]);
            }
            //update variables
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }
}
```
