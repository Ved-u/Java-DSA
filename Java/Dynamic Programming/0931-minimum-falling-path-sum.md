# 931. Minimum Falling Path Sum

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-falling-path-sum/
**Tags:** Array, Dynamic Programming, Matrix

## Approach 1 — 2024-08-17 23:12 (java)

*Runtime: 2 ms (faster than 75.9%) · Memory: 45.5 MB*

```java
class Solution {
    int dp[][]=new int[101][101];
    public int minFallingPathSum(int[][] matrix) {
        for(int x[]:dp)
            Arrays.fill(x,-101);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
          ans=Math.min(ans,solve(matrix,i,0));
        }
    return ans;
    }
    public int solve(int [][]matrix,int col,int row){
        if(row==matrix.length-1)return matrix[row][col];
        if(dp[row][col]!=-101)return dp[row][col];
        int ans=Integer.MAX_VALUE;
        if(col<matrix[0].length-1&&row<matrix.length-1)
        ans=Math.min(ans,matrix[row][col]+solve(matrix,col+1,row+1));
            if(col>0&&row<matrix.length-1)
        ans=Math.min(ans,matrix[row][col]+solve(matrix,col-1,row+1));
            if(row<matrix.length-1)
        ans=Math.min(ans,matrix[row][col]+solve(matrix,col,row+1));
    return dp[row][col]=ans;
    }
}
```

## Approach 2 — 2024-08-17 23:35 (java)

*Runtime: 7 ms (faster than 49.9%) · Memory: 44.9 MB*

```java
class Solution {
    public int minFallingPathSum(int[][] pref){
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<pref.length;i++){
            for(int j=0;j<pref[i].length;j++){
                if(j==0)pref[i][j]+=Math.min(pref[i-1][j],pref[i-1][j+1]);
    else if(j==pref[i].length-1)pref[i][j]+=Math.min(pref[i-1][j],pref[i-1][j-1]);
else pref[i][j]+=Math.min(Math.min(pref[i-1][j],pref[i-1][j-1]),pref[i-1][j+1]);
            }
        }
        for(int i=0;i<pref[0].length;i++){
            if(pref[pref.length-1][i]<ans)ans=pref[pref.length-1][i];
        }
    return ans;
    }
}
```
