# 3884. First Matching Character From Both Ends

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/first-matching-character-from-both-ends/
**Tags:** Two Pointers, String

## Approach 1 — 2026-03-29 19:06 (java)

*Runtime: 1 ms (faster than 55.8%) · Memory: 43.7 MB*

```java
class Solution {
    public int firstMatchingIndex(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.charAt(s.length()-i-1))return i;
        }
        return -1;
    }
}
```
