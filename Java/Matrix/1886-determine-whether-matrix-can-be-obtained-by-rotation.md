# 1886. Determine Whether Matrix Can Be Obtained By Rotation

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
**Tags:** Array, Matrix

## Approach 1 — 2026-03-23 22:08 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43.4 MB*

```java
class Solution {
    public boolean findRotation(int[][] mat, int[][] tgt) {
       if(compare(mat,tgt))return true;
       rotate(mat);
       if(compare(mat,tgt))return true;
       rotate(mat);
       if(compare(mat,tgt))return true;
       rotate(mat);
       if(compare(mat,tgt))return true;
       return false;
    }
    void rotate(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i>=j)continue;
                mat[i][j]=mat[i][j]^mat[j][i];
                mat[j][i]=mat[i][j]^mat[j][i];
                mat[i][j]=mat[i][j]^mat[j][i];
            }
        }
        reverse(mat);
    }
    void reverse(int[][] mat){
        for(int x[]:mat){
            int l=0,r=mat[0].length-1;
            while(l<r){
                x[l]=x[l]^x[r];
                x[r]=x[l]^x[r];
                x[l]=x[l]^x[r];
                l++;
                r--;
            }
        }
    }
    boolean compare(int[][] mat, int[][] tgt){
        boolean flag=true;
        out:for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=tgt[i][j]){
                    flag=false;
                    break out;
                }
            }
        }
        return flag;
    }
}
```
