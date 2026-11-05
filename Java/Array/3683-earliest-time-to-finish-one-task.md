# 3683. Earliest Time to Finish One Task

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/earliest-time-to-finish-one-task/
**Tags:** Array

## Approach 1 — 2025-11-21 23:00 (java)

*Runtime: 1 ms (faster than 95.6%) · Memory: 46.8 MB*

```java
class Solution {
    public int earliestTime(int[][] tasks) {
        int ans = Integer.MAX_VALUE;
        for(int x[]:tasks){
            ans=Math.min(ans,x[1]+x[0]);
        }
        return ans;
    }
}
```
