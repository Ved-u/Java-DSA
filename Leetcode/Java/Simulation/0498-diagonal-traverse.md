# 498. Diagonal Traverse

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/diagonal-traverse/
**Tags:** Array, Matrix, Simulation

## Approach 1 — 2024-09-22 10:43 (java)

*Runtime: 2 ms (faster than 99.4%) · Memory: 47 MB*

```java
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int ans[]=new int[m*n];
        int i=0,j=0,idx=0;
        boolean up=true;
        while(idx<ans.length){
            if(up){
                while(i>0 && j<n-1){
                    ans[idx++]=mat[i--][j++];
                }
                ans[idx++]=mat[i][j];
                if(j==n-1) i++;
                else j++;
                up=false;
            }
            else{
                while(j>0 && i<m-1){
                    ans[idx++]=mat[i++][j--];
                }
                ans[idx++]=mat[i][j];
                if(i==m-1)j++;
                else i++;
                up=true;
            }
        }
        return ans;
    }
}
```
