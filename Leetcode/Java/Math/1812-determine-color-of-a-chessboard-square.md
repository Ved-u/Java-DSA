# 1812. Determine Color of a Chessboard Square

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/determine-color-of-a-chessboard-square/
**Tags:** Math, String

## Approach 1 — 2024-05-15 20:25 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.2 MB*

```java
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int cell=(coordinates.charAt(0)-'a'+1);
        cell+=(coordinates.charAt(1)-'1'+1);
        if(cell%2==0)return false;
    return true;
    }
}
```
