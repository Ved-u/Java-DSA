# 3274. Check if Two Chessboard Squares Have the Same Color

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-two-chessboard-squares-have-the-same-color/
**Tags:** Math, String

## Approach 1 — 2024-09-01 08:46 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.8 MB*

```java
class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
if((c1.charAt(0)-'a'+c1.charAt(1)-'0')%2==(c2.charAt(0)-'a'+c2.charAt(1)-'0')%2)return true;
        return false;
    }
}
```
