# 2596. Check Knight Tour Configuration

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/check-knight-tour-configuration/
**Tags:** Array, Depth-First Search, Breadth-First Search, Matrix, Simulation

## Approach 1 — 2024-11-20 10:01 (java)

*Runtime: 1 ms (faster than 97.4%) · Memory: 44.4 MB*

```java
class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0)return false;
        return helper(grid,0,0,0);
    }
    public boolean helper(int[][] grid,int row,int col,int num){
        int n=grid.length;
        if(grid[row][col]==n*n-1)return true;
        //2 up one right
        int i=row-2,j=col+1;
        if(i>=0&&j<n&&grid[i][j]==num+1)return helper(grid,i,j,num+1);
        //2 up one left
        i=row-2;j=col-1;
        if(i>=0&&j>=0&&grid[i][j]==num+1)return helper(grid,i,j,num+1); 
        //2 left one up
        i=row-1;j=col-2;
        if(i>=0&&j>=0&&grid[i][j]==num+1)return helper(grid,i,j,num+1);
        //2 left one down
        i=row+1;j=col-2;
        if(i<n&&j>=0&&grid[i][j]==num+1)return helper(grid,i,j,num+1);
        //2 right one down
        i=row+1;j=col+2;
        if(i<n&&j<n&&grid[i][j]==num+1)return helper(grid,i,j,num+1);
        //2 right one up
        i=row-1;j=col+2;
        if(i>=0&&j<n&&grid[i][j]==num+1)return helper(grid,i,j,num+1);
        //2 down one right
        i=row+2;j=col+1;
        if(i<n&&j<n&&grid[i][j]==num+1)return helper(grid,i,j,num+1);
        //2 down one left
        i=row+2;j=col-1;
        if(i<n&&j>=0&&grid[i][j]==num+1)return helper(grid,i,j,num+1);
    return false;
    }
}
```
