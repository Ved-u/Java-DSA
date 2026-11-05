# 1941. Check if All Characters Have Equal Number of Occurrences

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
**Tags:** Hash Table, String, Counting

## Approach 1 — 2024-05-29 14:20 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 41.6 MB*

```java
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[]=new int[26];
        for(char x:s.toCharArray())
            freq[x-'a']++;
        for(int x:freq)
            if(x>0&&x!=freq[s.charAt(0)-'a'])return false;
    return true;        
    }
}
```
