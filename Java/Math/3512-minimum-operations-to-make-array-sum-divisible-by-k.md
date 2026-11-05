# 3512. Minimum Operations to Make Array Sum Divisible by K

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/
**Tags:** Array, Math

## Approach 1 — 2025-12-03 21:43 (java)

*Runtime: 1 ms (faster than 95.0%) · Memory: 47.2 MB*

```java
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        return sum%k;
    }
}
```
