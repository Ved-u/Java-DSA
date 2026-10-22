# 240. Search a 2D Matrix II

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/search-a-2d-matrix-ii/
**Tags:** Array, Binary Search, Divide and Conquer, Matrix

## Approach 1 — 2026-10-22 16:48 (java)

*Runtime: 4 ms (faster than 21.1%) · Memory: 47.9 MB*

```java
class Solution {
    public boolean searchMatrix(int[][] mat, int key) {
        int n=mat.length,m=mat[0].length;
        int currRow=n-1,currCol=0;
        while(currRow>=0&&currCol<=m-1){
            int currElement = mat[currRow][currCol];
            if(currElement==key){
               return true;
            }else if(currElement>key){// move up
                currRow--;
            }else{//currElement < key so move right
                currCol++;
            }
        }
        return false;
    }
}
```
