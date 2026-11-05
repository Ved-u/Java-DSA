# 1920. Build Array from Permutation

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/build-array-from-permutation/
**Tags:** Array, Simulation

## Approach 1 — 2024-02-01 22:08 (java)

*Runtime: 1 ms (faster than 99.6%) · Memory: 45.5 MB*

```java
class Solution {
    public int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
```
