# 4061. Minimum Queen Moves to Reach Target

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-queen-moves-to-reach-target/
**Tags:** Array, Math

## Approach 1 — 2026-11-02 21:58 (java)

*Runtime: 1 ms · Memory: 43.8 MB*

```java
class Solution {
    public int minQueenMoves(int[] src, int[] tgt) {
        if(src[0]==tgt[0]&&src[1]==tgt[1])return 0;
        else if(src[0]==tgt[0]||src[1]==tgt[1])return 1;
        else if(isOnDiagonal(src,tgt))return 1;
        else return 2;
    }
    boolean isOnDiagonal(int[] src, int[] tgt){
        return Math.abs(src[0] - tgt[0]) == Math.abs(src[1] - tgt[1]);
    }
}
```
