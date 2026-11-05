# 3427. Sum of Variable Length Subarrays

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-variable-length-subarrays/
**Tags:** Array, Prefix Sum

## Approach 1 — 2025-01-25 07:55 (java)

*Runtime: 1 ms (faster than 99.7%) · Memory: 43.6 MB*

```java
class Solution {
    public int subarraySum(int[] nums) {
        int ans=0,start;
        for(int i=0;i<nums.length;i++){
            start=Math.max(0,i-nums[i]);
            for(int j=start;j<=i;j++){
                ans+=nums[j];
            }
        }
    return ans;
    }
}
```
