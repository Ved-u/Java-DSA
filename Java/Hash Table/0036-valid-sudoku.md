# 36. Valid Sudoku

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/valid-sudoku/
**Tags:** Array, Hash Table, Matrix

## Approach 1 — 2024-11-21 17:57 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 43.5 MB*

```java
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                if(isValid(board,i,j)==false)return false;
            }
        }
    return true;
    }
    public boolean isValid(char[][] board,int row,int col){
        char num=board[row][col];
        board[row][col]='.';
        for(int i=0;i<9;i++){
            if(board[i][col]==num)return false;
        }
        for(int j=0;j<9;j++){
            if(board[row][j]==num)return false;
        }
        int sr=row/3*3,sc=col/3*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==num)return false;
            }
        }
        board[row][col]=num;
    return true;
    }
}
```
