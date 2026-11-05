# 1582. Special Positions in a Binary Matrix

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/special-positions-in-a-binary-matrix/
**Tags:** Array, Matrix

## Approach 1 — 2026-03-26 18:18 (java)

*Runtime: 3 ms (faster than 30.9%) · Memory: 47.4 MB*

```java
class Solution {
    public int numSpecial(int[][] mat) {
        int ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(special(mat,i,j))ans++;
            }
        }
        return ans;
    }
    boolean special(int[][] mat,int i,int j){
        if(mat[i][j]!=1)return false;
        for(int idx=0;idx<mat.length;idx++){
            if(idx==i)continue;
            if(mat[idx][j]==1)return false;
        }
        for(int idx=0;idx<mat[0].length;idx++){
            if(idx==j)continue;
            if(mat[i][idx]==1)return false;
        }
        return true;
    }
}
```
