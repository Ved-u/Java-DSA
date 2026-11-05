# 3014. Minimum Number of Pushes to Type Word I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/
**Tags:** Math, String, Greedy

## Approach 1 — 2026-07-30 11:46 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43 MB*

```java
class Solution {
    public int minimumPushes(String word) {//ans=8,n=9
        int ans = 0;
        int n = word.length();
        ans += Math.min(8, n);
        n -= Math.min(8, n);
        ans += 2 * Math.min(8, n);
        n -= Math.min(8, n);
        ans += 3 * Math.min(8, n);
        n -= Math.min(8, n);
        ans += 4 * Math.min(8, n);
        return ans;
    }
}
```
