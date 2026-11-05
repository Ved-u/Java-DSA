# 3931. Check Adjacent Digit Differences

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-adjacent-digit-differences/
**Tags:** String

## Approach 1 — 2026-05-17 19:27 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 43.6 MB*

```java
class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=1;i<s.length();i++){
            if(Math.abs(s.charAt(i)-s.charAt(i-1))>2)return false;
        }
        return true;
    }
}
```
