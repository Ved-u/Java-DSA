# 29. Divide Two Integers

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/divide-two-integers/
**Tags:** Math, Bit Manipulation

## Approach 1 — 2026-06-08 09:53 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 42.3 MB*

```java
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return dividend / divisor;
    }
}
```
