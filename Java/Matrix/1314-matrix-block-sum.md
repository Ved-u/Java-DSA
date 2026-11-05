# 1314. Matrix Block Sum

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/matrix-block-sum/
**Tags:** Array, Matrix, Prefix Sum

## Approach 1 — 2026-06-05 14:26 (java)

*Runtime: 261 ms (faster than 17.3%) · Memory: 46.2 MB*

```java
class Solution {
    public int[][] matrixBlockSum(int[][] mat, int kt) {
        int[][] ans = new int[mat.length][mat[0].length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                int sum=0;
                for(int k=i-kt;k<=i+kt;k++){
                    if(k<0||k>ans.length-1)continue;
                    for(int l=j-kt;l<=j+kt;l++){
                        if(l<0||l>ans[0].length-1)continue;
                        sum+=mat[k][l];
                    }
                }
                ans[i][j]=sum;
            }
        }
        
        return ans;
    }
}
```
