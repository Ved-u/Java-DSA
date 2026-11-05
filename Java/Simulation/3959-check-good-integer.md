# 3959. Check Good Integer

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-good-integer/
**Tags:** Math, Simulation

## Approach 1 — 2026-06-14 20:32 (java)

*Runtime: 2 ms (faster than 8.0%) · Memory: 42.3 MB*

```java
class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0,sqr=0;
        String x=""+n;
        for(char y:x.toCharArray()){
            sum+=y-'0';
            sqr+=(y-'0')*(y-'0');
        }
        return sqr-sum>=50;
    }
}
```
