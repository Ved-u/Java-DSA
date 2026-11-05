# 2486. Append Characters to String to Make Subsequence

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/
**Tags:** Two Pointers, String, Greedy

## Approach 1 — 2024-06-03 13:04 (java)

*Runtime: 7 ms (faster than 67.0%) · Memory: 45.2 MB*

```java
class Solution {
    public int appendCharacters(String s, String t) {
        int sIndex = 0, tIndex = 0;
        
        // Iterate over both strings
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++;
            }
            sIndex++;
        }
        
        // If tIndex equals t.length(), all characters in t are matched
        return t.length() - tIndex;
    }
}
```
