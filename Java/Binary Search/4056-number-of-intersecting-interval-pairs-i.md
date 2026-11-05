# 4056. Number of Intersecting Interval Pairs I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-intersecting-interval-pairs-i/
**Tags:** Array, Binary Search, Sorting, Enumeration

## Approach 1 — 2026-10-07 11:32 (java)

*Runtime: 6 ms · Memory: 47 MB*

```java
class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int ans=0;
        for(int i=0;i<intervals.length;i++){
            int x[]=intervals[i];
            for(int j=i+1;j<intervals.length;j++){
                int y[]=intervals[j];
                if((x[0]<=y[1]&&x[0]>=y[0])||(y[0]<=x[1]&&y[0]>=x[0])||
                (x[1]<=y[1]&&x[1]>=y[0])||(y[1]<=x[1]&&y[1]>=x[0]))ans++;
            }
        }
        return ans;
    }
}
```
