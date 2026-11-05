# 74. Search a 2D Matrix

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/search-a-2d-matrix/
**Tags:** Array, Binary Search, Matrix

## Approach 1 — 2024-06-29 19:41 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.5 MB*

```java
class Solution {
    public boolean searchMatrix(int[][] arr, int key) {
        int rows = arr.length;
        int cols = arr[0].length;
        int sR = 0, sC = 0;
        int eR = rows - 1, eC = cols - 1;
        while (sR <= eR && sC <= eC) {
            int mR = (sR + eR) / 2;
            int mC = (sC + eC) / 2;
            if (arr[mR][mC] == key) return true;
            else if (arr[mR][mC] > key) {
                // Adjust the end row and end column if the middle value is greater than the key
                if (arr[mR][sC] <= key) {
                    eC = mC - 1;
                } else {
                    eR = mR - 1;
                    eC = cols - 1; // Reset column end to the last column
                }
            } else {
                // Adjust the start row and start column if the middle value is less than the key
                if (arr[mR][eC] >= key)
                    sC = mC + 1;
                else {
                    sR = mR + 1;
                    sC = 0; // Reset column start to the first column
                }
            }
        }
    return false;
    }
}
```
