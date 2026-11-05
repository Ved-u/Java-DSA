# 52. N-Queens II

**Difficulty:** Hard
**Link:** https://leetcode.com/problems/n-queens-ii/
**Tags:** Backtracking, Algorithm X

## Approach 1 — 2024-11-05 07:30 (java)

*Runtime: 75 ms (faster than 8.2%) · Memory: 44.7 MB*

```java
class Solution {
    public int totalNQueens(int n) {
        char board[][]=new char[n][n];
        for(char x[]:board){
            Arrays.fill(x,'.');
        }
        int ans[]=new int[1];
        nQueens(board,0,ans);
    return ans[0];
    }
    void nQueens(char board[][],int row,int ans[]){
        if(row==board.length){
            ans[0]++;
            for(char x[]:board){
                for(char y:x){
                    System.out.print(y+" ");
                }
                 System.out.println();
            }
        return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1,ans);
                board[row][j]='.';
            }
        }
    }
    boolean isSafe(char board[][],int row,int col){
        //up down
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q')return false;
        }
        //left right
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q')return false;
        }
        //right diagonal
        for(int i=row,j=col;i>=0&&j<board.length;){
            if(board[i--][j++]=='Q')return false;
        }
        //left diagonal
         for(int i=row,j=col;i>=0&&j>=0;){
            if(board[i--][j--]=='Q')return false;
        }
        //bottom left
         for(int i=row,j=col;i<board.length&&j>=0;){
            if(board[i++][j--]=='Q')return false;
        }
        //bototm right
         for(int i=row,j=col;i<board.length&&j<board.length;){
            if(board[i++][j++]=='Q')return false;
        }
    return true;
    }
}
```
