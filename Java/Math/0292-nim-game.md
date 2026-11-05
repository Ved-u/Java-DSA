# 292. Nim Game

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/nim-game/
**Tags:** Math, Brainteaser, Minimax, Game Theory, Nim Game, Impartial Game

## Approach 1 — 2026-03-31 10:24 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.2 MB*

```java
class Solution {
    public boolean canWinNim(int n) {
        if(n%4==0)return false;
        return true;
    }
}
```
