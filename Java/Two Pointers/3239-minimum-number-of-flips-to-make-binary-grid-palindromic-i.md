# 3239. Minimum Number of Flips to Make Binary Grid Palindromic I

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-number-of-flips-to-make-binary-grid-palindromic-i/
**Tags:** Array, Two Pointers, Matrix

## Approach 1 — 2024-08-03 20:28 (java)

*Runtime: 6 ms (faster than 97.6%) · Memory: 111.4 MB*

```java
class Solution {
    public int minFlips(int[][] grid) {
        int col=0,row=0;
        for(int i=0;i<grid.length;i++){
            int left=0,right=grid[0].length-1;
            while(left<right){
                if(grid[i][left]!=grid[i][right])row++;
                left++;
                right--;
            }
        }
        for(int i=0;i<grid[0].length;i++){
            int left=0,right=grid.length-1;
            while(left<right){
                if(grid[left][i]!=grid[right][i])col++;
                left++;
                right--;
            }
        }
    return Math.min(col,row);
    }
}
```
