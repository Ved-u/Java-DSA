# 3190. Find Minimum Operations to Make All Elements Divisible by Three

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/
**Tags:** Array, Math

## Approach 1 — 2024-06-22 21:14 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.9 MB*

```java
class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        for(int x:nums){
            if(x%3!=0)ans++;
        }
        return ans;
    }
}
```
