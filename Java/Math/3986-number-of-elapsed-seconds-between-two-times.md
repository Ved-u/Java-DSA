# 3986. Number of Elapsed Seconds Between Two Times

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-elapsed-seconds-between-two-times/
**Tags:** Math, String

## Approach 1 — 2026-07-12 20:19 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 44.2 MB*

```java
class Solution {
    public int secondsBetweenTimes(String st, String et) {
        int ans = 60*60*(Integer.parseInt(et.substring(0,2))-Integer.parseInt(st.substring(0,2)));
        ans += 60*(Integer.parseInt(et.substring(3,5))-Integer.parseInt(st.substring(3,5)));
        ans += Integer.parseInt(et.substring(6))-Integer.parseInt(st.substring(6));
        return ans;
    }
}
```
