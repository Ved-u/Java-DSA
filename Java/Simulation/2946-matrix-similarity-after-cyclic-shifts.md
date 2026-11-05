# 2946. Matrix Similarity After Cyclic Shifts

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/
**Tags:** Array, Math, Matrix, Simulation

## Approach 1 — 2026-03-27 11:26 (java)

*Runtime: 1 ms (faster than 99.3%) · Memory: 47.1 MB*

```java
class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int[][] copy=new int[mat.length][];
        for(int i=0;i<mat.length;i++){
            copy[i]=Arrays.copyOf(mat[i],mat[i].length);
        }
        k = k%mat[0].length;
        for(int i=0;i<mat.length;i++){
            if(i%2==0){
                even(mat[i],k);
            }else{
                odd(mat[i],k);
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=copy[i][j])return false;
            }
        }
        return true;
    }
    void odd(int arr[],int k){
        while(k>0){
            int temp=arr[0];
            for(int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;
            k--;
        }
    }
    void even(int arr[],int k){
        while(k>0){
            int temp=arr[arr.length-1];
            for(int i=arr.length-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
            k--;
        }
    }
}
```
