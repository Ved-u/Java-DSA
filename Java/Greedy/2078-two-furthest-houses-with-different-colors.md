# 2078. Two Furthest Houses With Different Colors

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/two-furthest-houses-with-different-colors/
**Tags:** Array, Greedy

## Approach 1 — 2026-04-20 17:41 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43.2 MB*

```java
class Solution {
    public int maxDistance(int[] colors) {
        int max=Integer.MIN_VALUE;
        int l=0,r=colors.length-1;
        while(l<=r&&colors[l]==colors[r]){
            r--;
        }
        max=Math.max(max,Math.abs(l-r));
        l=0;
        r=colors.length-1;
        while(l<=r&&colors[l]==colors[r]){
            l++;
        }
        max=Math.max(max,Math.abs(l-r));
    return max;
    }
}
```
