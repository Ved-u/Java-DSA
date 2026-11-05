# 389. Find the Difference

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-difference/
**Tags:** Hash Table, String, Bit Manipulation, Sorting

## Approach 1 — 2024-08-06 19:39 (java)

*Runtime: 2 ms (faster than 69.6%) · Memory: 41.8 MB*

```java
class Solution {
    public char findTheDifference(String s, String t) {
        int freq[]=new int[26];
        int freq2[]=new int[26];
        for(char x:s.toCharArray())
            freq[x-'a']++;
        for(char x:t.toCharArray())
            freq2[x-'a']++;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=freq2[i])return (char)(i+97);
        }    
    return ' ';            
    }
}
```
