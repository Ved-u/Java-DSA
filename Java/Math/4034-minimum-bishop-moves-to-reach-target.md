# 4034. Minimum Bishop Moves to Reach Target

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-bishop-moves-to-reach-target/
**Tags:** Array, Math

## Approach 1 — 2026-09-01 22:04 (java)

*Runtime: 1 ms · Memory: 43.7 MB*

```java
class Solution {
    public int minBishopMoves(int[] s, int[] t) {
        if((s[0]+s[1])%2!=(t[0]+t[1])%2)return -1;
        if(s[0]==t[0]&&s[1]==t[1])return 0;
        if((s[0]+s[1]==t[0]+t[1])||(s[0]-s[1]==t[0]-t[1]))return 1;
        return 2;
    }
}
```
