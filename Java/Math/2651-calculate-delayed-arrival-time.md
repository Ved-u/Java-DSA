# 2651. Calculate Delayed Arrival Time

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/calculate-delayed-arrival-time/
**Tags:** Math

## Approach 1 — 2024-01-26 14:42 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.7 MB*

```java
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int ans=arrivalTime+delayedTime;
        if(ans>=24){
            ans=ans-24;
        }
        return ans;
    }
}
```
