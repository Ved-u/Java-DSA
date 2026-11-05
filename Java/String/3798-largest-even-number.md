# 3798. Largest Even Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/largest-even-number/
**Tags:** String

## Approach 1 — 2026-01-23 08:39 (java)

*Runtime: 1 ms (faster than 68.1%) · Memory: 44.1 MB*

```java
class Solution {
    public String largestEven(String s) {
        while(s.charAt(s.length()-1)!='2'){
            s = s.substring(0, s.length() - 1);
            if(s.length()==0)return "";
        }
        return s;
    }
}
```
