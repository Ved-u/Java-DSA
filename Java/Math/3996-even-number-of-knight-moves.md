# 3996. Even Number of Knight Moves

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/even-number-of-knight-moves/
**Tags:** Array, Math

## Approach 1 — 2026-07-22 10:33 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43.9 MB*

```java
class Solution {
    public boolean canReach(int[] start, int[] target) {
        return (start[0] + start[1]) % 2 == (target[0] + target[1]) % 2;
    }
}
```
