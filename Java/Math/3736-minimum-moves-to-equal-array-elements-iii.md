# 3736. Minimum Moves to Equal Array Elements III

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/
**Tags:** Array, Math

## Approach 1 — 2025-11-08 20:02 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 46.5 MB*

```java
class Solution {
    public int minMoves(int[] nums) {
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int x:nums)
            {
                max= Math.max(x,max);
            }
        for(int x:nums)
            {
                ans+=max-x;
            }
        return ans;
    }
}
```
