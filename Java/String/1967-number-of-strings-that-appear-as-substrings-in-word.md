# 1967. Number of Strings That Appear as Substrings in Word

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
**Tags:** Array, String

## Approach 1 — 2024-04-15 22:37 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans=0;
        for(int i=0;i<patterns.length;i++){
            if(word.contains(patterns[i]))ans++;
        }
    return ans;    
    }
}
```
