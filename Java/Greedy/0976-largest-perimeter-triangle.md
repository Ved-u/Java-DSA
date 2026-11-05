# 976. Largest Perimeter Triangle

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/largest-perimeter-triangle/
**Tags:** Array, Math, Greedy, Sorting, Quicksort, Polygons

## Approach 1 — 2024-03-05 01:20 (java)

*Runtime: 7 ms (faster than 99.7%) · Memory: 44.9 MB*

```java
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=nums.length-3;i>=0;i--){
            if(nums[i]+nums[i+1]>nums[i+2])return nums[i]+nums[i+1]+nums[i+2];
        }
        return 0;
    }
}
```
