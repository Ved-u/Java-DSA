# 35. Search Insert Position

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/search-insert-position/
**Tags:** Array, Binary Search

## Approach 1 — 2024-03-04 19:11 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.7 MB*

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
      //  int ans=0;
        for(int i=0;i<nums.length;i++){
            if(target<nums[0])return 0;
            if(target>nums[nums.length-1])return nums.length;
            if(target==nums[i])return i;
            if(target<nums[i]&&target>nums[i-1])return i;
        }
        return -1;
    }
}
```
