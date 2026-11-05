# 1961. Check If String Is a Prefix of Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/
**Tags:** Array, Two Pointers, String

## Approach 1 — 2024-08-11 22:42 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.7 MB*

```java
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder t=new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(t.length()>=s.length())break;
            t.append(words[i]);
        }
    return s.equals(t.toString());    
    }
}
```
