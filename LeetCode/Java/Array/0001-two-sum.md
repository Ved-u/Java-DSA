# 1. Two Sum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/two-sum/
**Tags:** Array, Hash Table

## Approach 1 — 2026-09-29 20:16 (java)

*Runtime: 5 ms (faster than 49.6%) · Memory: 46.6 MB*

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
    return new int[] {};
    }
}
```
