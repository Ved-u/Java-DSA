# 1572. Matrix Diagonal Sum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/matrix-diagonal-sum/
**Tags:** Array, Matrix

## Approach 1 — 2024-08-02 00:41 (java)

*Runtime: 1 ms (faster than 30.8%) · Memory: 44.2 MB*

```java
class Solution {
    public int diagonalSum(int[][] mat) {
        int ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j||i+j==mat.length-1)ans+=mat[i][j];
            }
        }
      //  ans-=mat[mat.length/2][mat.length/2];
    return ans;
    }
}
```

## Approach 2 — 2024-08-02 00:42 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.5 MB*

```java
class Solution {
    public int diagonalSum(int[][] mat) {
     int sum=0;
     int n=mat.length;
     int i=0,j=0;
     while(i<n){
        sum+=mat[i][j];
        i++;
        j++;
     }  
     i=0;
     j=n-1;
     while(j>=0){
        if(i!=j)
        sum=sum+mat[i][j];
        i++;
        j--;
     } 
     return sum;
    }
}
```
