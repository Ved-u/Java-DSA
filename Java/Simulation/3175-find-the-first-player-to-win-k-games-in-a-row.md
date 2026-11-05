# 3175. Find The First Player to win K Games in a Row

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-the-first-player-to-win-k-games-in-a-row/
**Tags:** Array, Simulation

## Approach 1 — 2024-11-07 18:49 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 60.4 MB*

```java
class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int n = skills.length;
        int idx = 0, c = 0;
        for (int i = 1; i < n; i++) {
            if (skills[idx] < skills[i]) {
                idx = i;
                c = 1;
            } else c++;
            if (c == k) return idx;
        }
    return idx;
    }
}
```
