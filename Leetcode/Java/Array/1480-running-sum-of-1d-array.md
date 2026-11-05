# 1480. Running Sum of 1d Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/running-sum-of-1d-array/
**Tags:** Array, Prefix Sum

## Approach 1 — 2024-02-01 21:43 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.9 MB*

```java
class Solution {
    public int[] runningSum(int[] nums) {
        int rsum[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            rsum[i]=sum;
        }
        return rsum;
    }
}
```
