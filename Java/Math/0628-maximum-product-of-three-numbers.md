# 628. Maximum Product of Three Numbers

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-product-of-three-numbers/
**Tags:** Array, Math, Sorting

## Approach 1 — 2026-07-26 08:26 (java)

*Runtime: 15 ms · Memory: 48.1 MB*

```java
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);
    }
}
```
