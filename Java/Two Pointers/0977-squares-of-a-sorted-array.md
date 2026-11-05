# 977. Squares of a Sorted Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/squares-of-a-sorted-array/
**Tags:** Array, Two Pointers, Sorting

## Approach 1 — 2024-03-02 14:33 (java)

*Runtime: 8 ms (faster than 38.7%) · Memory: 46.3 MB*

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
```
