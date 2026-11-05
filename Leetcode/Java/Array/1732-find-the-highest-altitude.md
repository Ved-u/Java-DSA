# 1732. Find the Highest Altitude

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-highest-altitude/
**Tags:** Array, Prefix Sum

## Approach 1 — 2024-08-02 00:33 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.2 MB*

```java
class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0,alti=0;
        for(int x:gain){
            alti+=x;
            ans=Math.max(ans,alti);
        }
    return ans;    
    }
}
```
