# 1037. Valid Boomerang

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/valid-boomerang/
**Tags:** Array, Math, Geometry

## Approach 1 — 2026-06-22 10:01 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43.2 MB*

```java
class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];
        int area2 = x1 * (y2 - y3)
                  + x2 * (y3 - y1)
                  + x3 * (y1 - y2);
        return area2 != 0;
    }
}
```
