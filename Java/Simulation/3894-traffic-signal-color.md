# 3894. Traffic Signal Color

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/traffic-signal-color/
**Tags:** Math, String, Simulation

## Approach 1 — 2026-04-11 20:04 (java)

*Runtime: 1 ms (faster than 81.7%) · Memory: 42.7 MB*

```java
class Solution {
    public String trafficSignal(int timer) {
        if(timer==0)return "Green";
        if(timer==30)return "Orange";
        if(timer>30&&timer<=90)return "Red";
        return "Invalid";
    }
}
```
