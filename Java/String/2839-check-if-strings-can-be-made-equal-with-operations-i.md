# 2839. Check if Strings Can be Made Equal With Operations I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-i/
**Tags:** String

## Approach 1 — 2026-03-29 18:57 (java)

*Runtime: 2 ms (faster than 42.2%) · Memory: 44.4 MB*

```java
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] even1 = {s1.charAt(0), s1.charAt(2)};
        char[] odd1  = {s1.charAt(1), s1.charAt(3)};
        
        char[] even2 = {s2.charAt(0), s2.charAt(2)};
        char[] odd2  = {s2.charAt(1), s2.charAt(3)};
        
        java.util.Arrays.sort(even1);
        java.util.Arrays.sort(odd1);
        java.util.Arrays.sort(even2);
        java.util.Arrays.sort(odd2);
        
        return java.util.Arrays.equals(even1, even2) &&
               java.util.Arrays.equals(odd1, odd2);
    }
}
```
