# 796. Rotate String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/rotate-string/
**Tags:** String, String Matching

## Approach 1 — 2026-08-11 10:05 (java)

*Runtime: 2 ms · Memory: 43.4 MB*

```java
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        if((s+s).contains(goal))return true;
        return false;
    }
}
```
