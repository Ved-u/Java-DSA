# 3065. Minimum Operations to Exceed Threshold Value I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/
**Tags:** Array

## Approach 1 — 2024-03-11 17:55 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.5 MB*

```java
class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k)ans++;
        }
        return ans;
    }
}
```
