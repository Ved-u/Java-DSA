# 452. Minimum Number of Arrows to Burst Balloons

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
**Tags:** Array, Greedy, Sorting

## Approach 1 — 2024-04-28 18:35 (java)

*Runtime: 52 ms (faster than 70.5%) · Memory: 68.7 MB*

```java
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int ans = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++)
            if (points[i][0] > end) { 
                ans++;
                end = points[i][1]; 
            }
    return ans;
    }
}
```
