# 240. Search a 2D Matrix II

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/search-a-2d-matrix-ii/
**Tags:** Array, Binary Search, Divide and Conquer, Matrix

## Approach 1 — 2026-10-22 16:48 (java)

*Runtime: 4 ms · Memory: 47.9 MB*

```java
class Solution {
    public boolean searchMatrix(int[][] mat, int key) {
        int n=mat.length,m=mat[0].length;
        int currRow=n-1,currCol=0;
        while(currRow>=0&&currCol<=m-1){
            int currElement = mat[currRow][currCol];
            if(currElement==key){
               return true;
            }else if(currElement>key){// move up
                currRow--;
            }else{//currElement < key so move right
                currCol++;
            }
        }
        return false;
    }
}
```

## Approach 2 — 2024-06-29 20:52 (java)

*Runtime: 5 ms (faster than 14.3%) · Memory: 45.9 MB*

```java
class Solution {
    public boolean searchMatrix(int[][] arr, int key) {
        int i=0,j=arr[0].length-1;
        while(i<arr.length&&j>=0){
            if(arr[i][j]==key)return true;
            else if(arr[i][j]>key)j--;
            else i++;
        }
    return false;
    }
}
```

## Approach 3 — 2024-06-29 20:53 (java)

*Runtime: 5 ms (faster than 14.3%) · Memory: 46.1 MB*

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
        
    }
}
```

## Approach 4 — 2024-06-29 20:54 (java)

*Runtime: 5 ms (faster than 14.3%) · Memory: 46.1 MB*

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >=0){
            if(matrix[row][col] == target)return true;
            else if(matrix[row][col] > target)col--;
            else row++;
        }
    return false;
    }
}
```
