# 201. Bitwise AND of Numbers Range

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/bitwise-and-of-numbers-range/
**Tags:** Bit Manipulation

## Approach 1 — 2024-02-21 10:24 (java)

*Runtime: 4 ms (faster than 44.4%) · Memory: 44 MB*

```java
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
   int shift = 0;
        while(left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }
}
```
