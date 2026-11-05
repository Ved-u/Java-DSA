# 1400. Construct K Palindrome Strings

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/construct-k-palindrome-strings/
**Tags:** Hash Table, String, Greedy, Counting

## Approach 1 — 2025-01-11 09:10 (java)

*Runtime: 4 ms (faster than 95.4%) · Memory: 45.4 MB*

```java
class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k)return false;
        int freq[]=new int[26];
        for(char x:s.toCharArray()){
            freq[x-'a']++;
        }
        int odd=0;
        for(int x:freq){
            if(x%2==1)odd++;
        }
    return odd<=k;
    }
}
```
