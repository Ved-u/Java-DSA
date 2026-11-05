# 153. Find Minimum in Rotated Sorted Array

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
**Tags:** Array, Binary Search

## Approach 1 — 2026-05-15 10:34 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43.9 MB*

```java
class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            min=Math.min(min,x);
        }
        return min;
    }
}
```
