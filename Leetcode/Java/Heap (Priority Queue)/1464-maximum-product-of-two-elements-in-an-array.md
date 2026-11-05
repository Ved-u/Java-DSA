# 1464. Maximum Product of Two Elements in an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
**Tags:** Array, Sorting, Heap (Priority Queue)

## Approach 1 — 2026-07-27 11:05 (java)

*Runtime: 6 ms · Memory: 45 MB*

```java
class Solution {
    public int maxProduct(int[] nums) {
    Arrays.sort(nums);
    return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
```
