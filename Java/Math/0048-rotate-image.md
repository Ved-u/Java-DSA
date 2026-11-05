# 48. Rotate Image

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/rotate-image/
**Tags:** Array, Math, Matrix

## Approach 1 — 2024-06-16 19:50 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.1 MB*

```java
class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
               matrix[i][j]=matrix[i][j]^matrix[j][i];
               matrix[j][i]=matrix[i][j]^matrix[j][i];
               matrix[i][j]=matrix[i][j]^matrix[j][i];
            }
        }//reverse
        for(int x[]:matrix){
            reverse(x);
        }
    }
    public static void reverse(int arr[]){
        int start=0,end=arr.length-1;
        while(start<end){
            arr[start]=arr[start]^arr[end];
            arr[end]=arr[start]^arr[end];
            arr[start]=arr[start]^arr[end];
            start++;
            end--;
        }
    }
}
```
