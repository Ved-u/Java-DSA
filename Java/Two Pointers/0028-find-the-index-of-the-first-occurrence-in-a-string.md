# 28. Find the Index of the First Occurrence in a String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
**Tags:** Two Pointers, String, String Matching, Z Algorithm, Knuth–Morris–Pratt Algorithm, Boyer–Moore String-Search Algorithm

## Approach 1 — 2024-08-07 13:22 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.2 MB*

```java
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
```
