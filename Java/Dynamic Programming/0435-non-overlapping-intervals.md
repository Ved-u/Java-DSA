# 435. Non-overlapping Intervals

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/non-overlapping-intervals/
**Tags:** Array, Dynamic Programming, Greedy, Sorting

## Approach 1 — 2024-12-08 10:29 (java)

*Runtime: 53 ms (faster than 15.0%) · Memory: 73.7 MB*

```java
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(i1,i2)->Integer.compare(i1[0],i2[0]));
        int ans=0,prevEndTime=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int curr[]=intervals[i];
            if(curr[0]<prevEndTime){
                ans++;
                prevEndTime=Math.min(curr[1],prevEndTime);
            }else prevEndTime=curr[1];
        }
    return ans;
    }
}
```

## Approach 2 — 2024-12-08 10:32 (java)

*Runtime: 46 ms (faster than 77.6%) · Memory: 73.7 MB*

```java
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (i1,i2) -> i1[1] - i2[1]);
        int ans = 0;
        int E = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < E) ans++;
            else E = intervals[i][1]; 
        }
    return ans;
    }
}
```
