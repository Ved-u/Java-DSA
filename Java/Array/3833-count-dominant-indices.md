# 3833. Count Dominant Indices

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-dominant-indices/
**Tags:** Array, Enumeration

## Approach 1 — 2026-03-17 16:56 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 46.5 MB*

```java
class Solution {
    public int dominantIndices(int[] nums) {
        int ans=0;
        int sum=0;
        for(int x:nums)sum+=x;
        for(int i=0;i<nums.length-1;i++){
            sum-=nums[i];
        
            if(nums[i]>(sum/(nums.length-(i+1))))ans++;
        }
        return ans;
    }
}
```
