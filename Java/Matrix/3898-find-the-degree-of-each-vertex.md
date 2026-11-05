# 3898. Find the Degree of Each Vertex

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-degree-of-each-vertex/
**Tags:** Array, Graph Theory, Matrix

## Approach 1 — 2026-04-12 08:09 (java)

*Runtime: 2 ms (faster than 78.2%) · Memory: 48.4 MB*

```java
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(matrix[i][j]==1){
                    ans[i]++;
                    ans[j]++;
                }
            }
        }
    return ans;
    }
}
```
