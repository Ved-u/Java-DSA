# 1662. Check If Two String Arrays are Equivalent

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
**Tags:** Array, String

## Approach 1 — 2024-04-15 21:58 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.8 MB*

```java
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            s1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            s2.append(word2[i]);
        }
        if(s1.toString().equals(s2.toString()))return true;
    return false;    
    }
}
```
