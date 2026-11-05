# 2255. Count Prefixes of a Given String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-prefixes-of-a-given-string/
**Tags:** Array, String

## Approach 1 — 2024-06-10 22:31 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43.3 MB*

```java
class Solution {
    public int countPrefixes(String[] words, String s) {
        int ans = 0;
        for (String word : words) 
            if (s.startsWith(word)) 
                ans++;
            
    return ans;
    }
}
```
