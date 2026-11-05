# 2042. Check if Numbers Are Ascending in a Sentence

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/
**Tags:** String

## Approach 1 — 2024-06-19 10:20 (java)

*Runtime: 1 ms (faster than 94.3%) · Memory: 41.5 MB*

```java
class Solution {
    public boolean areNumbersAscending(String s) {
    int lastNum = -1;
    int curr;
    for (int i = 0; i < s.length(); i++) {
        if (Character.isDigit(s.charAt(i))) {
        curr = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            curr = curr * 10 + (s.charAt(i) - '0');
            i++;
        } 
        if (curr <= lastNum) return false; 
        lastNum = curr;
        }
    }      
    return true;
    }
}
```
