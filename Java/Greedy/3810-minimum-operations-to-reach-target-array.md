# 3810. Minimum Operations to Reach Target Array

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-operations-to-reach-target-array/
**Tags:** Array, Hash Table, Greedy

## Approach 1 — 2026-01-17 21:00 (java)

*Runtime: 24 ms (faster than 92.4%) · Memory: 123.4 MB*

```java
class Solution {
    public int minOperations(int[] nums, int[] target) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target[i])set.add(nums[i]);
        }
        return set.size();
    }
}
```
