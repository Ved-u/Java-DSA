# 1556. Thousand Separator

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/thousand-separator/
**Tags:** String

## Approach 1 — 2024-08-11 23:04 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.9 MB*

```java
class Solution {
    public String thousandSeparator(int n) {
        StringBuilder t=new StringBuilder(""+n);
        if(t.length()>3)t.insert(t.length()-3,'.');
        if(t.length()>7)t.insert(t.length()-7,'.');
        if(t.length()>11)t.insert(t.length()-11,'.');
    return t.toString();
    }
}
```
