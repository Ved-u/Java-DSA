# 1768. Merge Strings Alternately

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/merge-strings-alternately/
**Tags:** Two Pointers, String

## Approach 1 — 2024-05-09 12:12 (java)

*Runtime: 1 ms (faster than 96.5%) · Memory: 41.3 MB*

```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<(Math.max(word1.length(),word2.length()));i++){
            if(i<word1.length()&&i<word2.length()){
                str.append(word1.charAt(i));
                str.append(word2.charAt(i));
            }else if(i<word1.length()){
                str.append(word1.charAt(i));
            }else{
                str.append(word2.charAt(i));
            }
        }
    return str.toString();    
    }
}
```
