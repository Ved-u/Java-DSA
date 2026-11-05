# 2828. Check if a String Is an Acronym of Words

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
**Tags:** Array, String

## Approach 1 — 2024-03-30 22:16 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 44.6 MB*

```java
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length())return false;
        int count=0;
      for(int i=0;i<words.size();i++){
            if(words.get(i).charAt(0)!=s.charAt(count++))return false;
      }
    return true;    
    }
}
```
