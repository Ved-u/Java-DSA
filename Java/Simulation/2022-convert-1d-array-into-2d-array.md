# 2022. Convert 1D Array Into 2D Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/convert-1d-array-into-2d-array/
**Tags:** Array, Matrix, Simulation

## Approach 1 — 2024-09-01 08:52 (java)

*Runtime: 5 ms (faster than 23.6%) · Memory: 55.5 MB*

```java
class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        int ans[][]=new int[m][n];
        if(m*n<arr.length||m*n>arr.length)return new int[0][0];
        int indx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=arr[indx++];
            }
        }
    return ans;
    }
}
```

## Approach 2 — 2024-09-01 08:54 (java)

*Runtime: 3 ms (faster than 96.4%) · Memory: 55.6 MB*

```java
class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        if(m*n!=arr.length)return new int[0][0];
        int ans[][]=new int[m][n];
        int indx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=arr[indx++];
            }
        }
    return ans;
    }
}
```
