# 1351. Count Negative Numbers in a Sorted Matrix

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
**Tags:** Array, Binary Search, Matrix

## Approach 1 — 2025-12-29 21:38 (java)

*Runtime: 1 ms (faster than 60.3%) · Memory: 46.9 MB*

```java
class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        for(int x[]:grid){
            for(int y:x){
                if(y<0)ans++;
            }
        }
        return ans;
    }
}
```
