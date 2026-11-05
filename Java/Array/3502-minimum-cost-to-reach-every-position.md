# 3502. Minimum Cost to Reach Every Position

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-cost-to-reach-every-position/
**Tags:** Array

## Approach 1 — 2026-10-02 16:36 (java)

*Runtime: 1 ms · Memory: 46.7 MB*

```java
class Solution {
    public int[] minCosts(int[] cost) {
        int[] ans = new int[cost.length];
        int min = Integer.MAX_VALUE;
        // int pref[] = new int[cost.length];
        for(int i=0;i<cost.length;i++){
            min = Math.min(min,cost[i]);
            ans[i] = min;
        }
        return ans;
    }
}
```
