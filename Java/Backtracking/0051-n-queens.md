# 51. N-Queens

**Difficulty:** Hard
**Link:** https://leetcode.com/problems/n-queens/
**Tags:** Array, Backtracking, Algorithm X

## Approach 1 — 2024-11-05 07:10 (java)

*Runtime: 11 ms (faster than 5.9%) · Memory: 44.8 MB*

```java
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char chess[][]=new char[n][n];
        for(char x[]:chess)
            Arrays.fill(x,'.');
        nQueens(chess,0,ans);
    return ans;
    }
    void nQueens(char chess[][],int row,List<List<String>> ans){
        if(row==chess.length){
            //copy to ans array
            List<String> l=new ArrayList<>();
            for(char x[]:chess){
                String str="";
                for(char y:x){
                    str+=y;
                }
                l.add(str);
            }
            ans.add(l);
        return;
        }
        for(int j=0;j<chess.length;j++){
            if(isSafe(chess,row,j)){
                chess[row][j]='Q';
                nQueens(chess,row+1,ans);
                chess[row][j]='.';//backtracking
            }
        }
    }
    boolean isSafe(char chess[][],int row,int col){
        //N S
        for(int i=0;i<chess.length;i++){
            if(chess[i][col]=='Q')return false;
        }
        //E W
        for(int j=0;j<chess.length;j++){
            if(chess[row][j]=='Q')return false;
        }
        //NE
        int i=row,j=col;
        while(i>=0&&j<chess.length){
            if(chess[i--][j++]=='Q')return false;
        }
        //NW
        i=row;j=col;
        while(i>=0&&j>=0){
            if(chess[i--][j--]=='Q')return false;
        }
        //SW
        i=row;j=col;
        while(i<chess.length&&j>=0){
            if(chess[i++][j--]=='Q')return false;
        }
        //SE
        i=row;j=col;
        while(i<chess.length&&j<chess.length){
            if(chess[i++][j++]=='Q')return false;
        }
    return true;
    }
}
```
