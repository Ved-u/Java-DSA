# 2437. Number of Valid Clock Times

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-valid-clock-times/
**Tags:** String, Enumeration

## Approach 1 — 2026-03-28 23:53 (java)

*Runtime: 88 ms (faster than 6.0%) · Memory: 46.8 MB*

```java
class Solution {
    public int countTime(String time) {
        int count = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                String t = String.format("%02d:%02d", h, m);
                if (isMatch(time, t)) {
                    count++;
                }
            }
        }
        return count;
    }
    private boolean isMatch(String pattern, String actual) {
        for (int i = 0; i < 5; i++) {
if (pattern.charAt(i) != '?' && pattern.charAt(i) != actual.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
```
